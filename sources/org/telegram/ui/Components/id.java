package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class id implements Runnable {
    public final int f25686a;
    public final ChatActivityEnterView f25687b;

    public id(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25686a = i10;
        this.f25687b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        ff ffVar;
        long N8;
        int i10 = this.f25686a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z4 = true;
        ChatActivityEnterView chatActivityEnterView = this.f25687b;
        switch (i10) {
            case 0:
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f22702j5;
                AndroidUtilities.runOnUIThread(new id(chatActivityEnterView, 4));
                return;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 4:
                rh.z zVar = chatActivityEnterView.f22753i0;
                if (zVar != null) {
                    zVar.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.O1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.K2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f31614o0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z4 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f22737f2 && z4 && (ffVar = chatActivityEnterView.B0) != null) {
                    try {
                        ffVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Z4 == null) {
                        ufVar.getLayoutParams().height = chatActivityEnterView.f22846z3;
                    }
                    chatActivityEnterView.R0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar != null) {
                    cfVar.h(chatActivityEnterView.A4);
                    chatActivityEnterView.I0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.zn znVar2 = chatActivityEnterView.L2;
                if (znVar2 == null || znVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.J4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.S1();
                return;
            case 10:
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.K);
                return;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.I);
                return;
            case 13:
                int i13 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.L0();
                return;
            case 14:
                qc.a0(chatActivityEnterView.L2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                ff ffVar2 = chatActivityEnterView.B0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                    return;
                }
                return;
            case 16:
                ff ffVar3 = chatActivityEnterView.B0;
                if (ffVar3 != null) {
                    ffVar3.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 17:
                cf cfVar2 = chatActivityEnterView.I0;
                if (cfVar2 != null) {
                    cfVar2.h(false);
                    chatActivityEnterView.I0 = null;
                }
                AndroidUtilities.runOnUIThread(new yd(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                z4.M(chatActivityEnterView.K2, chatActivityEnterView.L2.a(), new he(chatActivityEnterView, 1), chatActivityEnterView.S3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f22702j5;
                ChatActivityEnterView chatActivityEnterView2 = this.f25687b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                cf cfVar3 = chatActivityEnterView2.I0;
                if (cfVar3 != null) {
                    cfVar3.h(false);
                    chatActivityEnterView2.I0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.zn znVar3 = chatActivityEnterView.L2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.A1;
                if (richMessage != null && chatActivityEnterView.B0 != null && znVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.N).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.A1;
                        if (richMessage2 != null && chatActivityEnterView.B0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vh.x4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                            if (u5VarArr != null) {
                                for (u5 u5Var : u5VarArr) {
                                    u5Var.applyFontMetrics(chatActivityEnterView.B0.getPaint().getFontMetricsInt(), l5.g());
                                }
                            }
                            aj0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    vh.y1 y1Var = new vh.y1(richMessage);
                    y1Var.e = true;
                    y1Var.setResourceProvider(chatActivityEnterView.S3);
                    y1Var.G = znVar3;
                    y1Var.f46397s = znVar3.P;
                    y1Var.v = znVar3.V;
                    y1Var.I = new id(chatActivityEnterView, 24);
                    y1Var.H = new id(chatActivityEnterView, 25);
                    znVar3.presentFragment(y1Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.zn znVar4 = chatActivityEnterView.L2;
                if (znVar4 != null) {
                    znVar4.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f22750h3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.S = null;
                return;
            case 24:
                ff ffVar4 = chatActivityEnterView.B0;
                if (ffVar4 != null) {
                    ffVar4.setText("");
                    return;
                }
                return;
            case 25:
                ff ffVar5 = chatActivityEnterView.B0;
                if (ffVar5 != null) {
                    ffVar5.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f22750h3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f22702j5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.N;
                long j10 = chatActivityEnterView.M2;
                String str = chatActivityEnterView.f22735f0;
                String str2 = chatActivityEnterView.f22741g0;
                org.telegram.ui.zn znVar5 = chatActivityEnterView.L2;
                if (znVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = znVar5.N8();
                }
                rh.y3 b10 = rh.y3.b(i18, j10, j10, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
                    rh.z zVar2 = chatActivityEnterView.f22753i0;
                    if (zVar2 != null) {
                        zVar2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.yb0.l(chatActivityEnterView.f22741g0)) {
                    ?? obj = new Object();
                    obj.f47469c = new id(chatActivityEnterView, 1);
                    ze.d.k(chatActivityEnterView.getContext(), chatActivityEnterView.f22741g0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.N).getUser(Long.valueOf(chatActivityEnterView.M2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
                    if (user != null) {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.N);
                        MessagesController.showCantOpenAlert(znVar5, restrictionReason);
                        return;
                    }
                    rh.p2 p2Var = new rh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.S3);
                    p2Var.w(false);
                    p2Var.f43761x0 = true;
                    p2Var.f43741h0 = chatActivityEnterView.K2;
                    p2Var.s(znVar5, b10);
                    p2Var.show();
                    rh.z zVar3 = chatActivityEnterView.f22753i0;
                    if (zVar3 != null) {
                        zVar3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f22753i0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.N, chatActivityEnterView.M2)) {
                    chatActivityEnterView.f22753i0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
