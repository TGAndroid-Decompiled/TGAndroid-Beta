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
public final class sd implements Runnable {
    public final int f28163a;
    public final ChatActivityEnterView f28164b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28163a = i10;
        this.f28164b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        pf pfVar;
        long N8;
        int i10 = this.f28163a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f28164b;
        switch (i10) {
            case 0:
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f21967n5;
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 4));
                return;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 4:
                ei.c0 c0Var = chatActivityEnterView.f22036l0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f31151r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f22027j2 && z10 && (pfVar = chatActivityEnterView.E0) != null) {
                    try {
                        pfVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f21993d5 == null) {
                        dgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar != null) {
                    mfVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                if (znVar2 == null || znVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.S1();
                return;
            case 10:
                ng ngVar = chatActivityEnterView.Z2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.N);
                return;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.L);
                return;
            case 13:
                int i13 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.L0();
                return;
            case 14:
                xc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
                    return;
                }
                return;
            case 16:
                pf pfVar3 = chatActivityEnterView.E0;
                if (pfVar3 != null) {
                    pfVar3.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 17:
                mf mfVar2 = chatActivityEnterView.L0;
                if (mfVar2 != null) {
                    mfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                d5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new qe(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f21967n5;
                ChatActivityEnterView chatActivityEnterView2 = this.f28164b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                mf mfVar3 = chatActivityEnterView2.L0;
                if (mfVar3 != null) {
                    mfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.zn znVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && znVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                for (y5 y5Var : y5VarArr) {
                                    y5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), p5.g());
                                }
                            }
                            fj0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    ii.d2 d2Var = new ii.d2(richMessage);
                    d2Var.e = true;
                    d2Var.setResourceProvider(chatActivityEnterView.W3);
                    d2Var.J = znVar3;
                    d2Var.f11322s = znVar3.S;
                    d2Var.v = znVar3.Y;
                    d2Var.L = new sd(chatActivityEnterView, 24);
                    d2Var.K = new sd(chatActivityEnterView, 25);
                    znVar3.presentFragment(d2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.zn znVar4 = chatActivityEnterView.P2;
                if (znVar4 != null) {
                    znVar4.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f22038l3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.w1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                pf pfVar4 = chatActivityEnterView.E0;
                if (pfVar4 != null) {
                    pfVar4.setText("");
                    return;
                }
                return;
            case 25:
                pf pfVar5 = chatActivityEnterView.E0;
                if (pfVar5 != null) {
                    pfVar5.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.V0();
                return;
            case 27:
                chatActivityEnterView.f22038l3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f21967n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f22019i0;
                String str2 = chatActivityEnterView.f22025j0;
                org.telegram.ui.zn znVar5 = chatActivityEnterView.P2;
                if (znVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = znVar5.N8();
                }
                ei.f5 b10 = ei.f5.b(i18, j3, j3, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.f22036l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.hc0.l(chatActivityEnterView.f22025j0)) {
                    ?? obj = new Object();
                    obj.f15443c = new sd(chatActivityEnterView, 1);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f22025j0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.Q2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
                    if (user != null) {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(znVar5, restrictionReason);
                        return;
                    }
                    ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    k3Var.w(false);
                    k3Var.A0 = true;
                    k3Var.f8439k0 = chatActivityEnterView.O2;
                    k3Var.s(znVar5, b10);
                    k3Var.show();
                    ei.c0 c0Var3 = chatActivityEnterView.f22036l0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f22036l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f22036l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
