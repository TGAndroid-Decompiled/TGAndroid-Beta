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
public final class ld implements Runnable {
    public final int f30289a;
    public final ChatActivityEnterView f30290b;

    public ld(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30289a = i10;
        this.f30290b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        jf jfVar;
        long N8;
        int i10 = this.f30289a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f30290b;
        switch (i10) {
            case 0:
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null) {
                    tnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f26085i5;
                AndroidUtilities.runOnUIThread(new ld(chatActivityEnterView, 4));
                return;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 4:
                ph.z zVar = chatActivityEnterView.f26131h0;
                if (zVar != null) {
                    zVar.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.N1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.J2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f35587n0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f26114e2 && z10 && (jfVar = chatActivityEnterView.A0) != null) {
                    try {
                        jfVar.requestFocus();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 6:
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        xfVar.getLayoutParams().height = chatActivityEnterView.f26223y3;
                    }
                    chatActivityEnterView.Q0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                ff ffVar = chatActivityEnterView.H0;
                if (ffVar != null) {
                    ffVar.h(chatActivityEnterView.f26229z4);
                    chatActivityEnterView.H0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.tn tnVar2 = chatActivityEnterView.K2;
                if (tnVar2 == null || tnVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.I4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.S1();
                return;
            case 10:
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.J);
                return;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.H);
                return;
            case 13:
                int i13 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.L0();
                return;
            case 14:
                tc.a0(chatActivityEnterView.K2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                jf jfVar2 = chatActivityEnterView.A0;
                if (jfVar2 != null) {
                    jfVar2.setText("");
                    return;
                }
                return;
            case 16:
                jf jfVar3 = chatActivityEnterView.A0;
                if (jfVar3 != null) {
                    jfVar3.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 17:
                ff ffVar2 = chatActivityEnterView.H0;
                if (ffVar2 != null) {
                    ffVar2.h(false);
                    chatActivityEnterView.H0 = null;
                }
                AndroidUtilities.runOnUIThread(new be(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                c5.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new ke(chatActivityEnterView, 1), chatActivityEnterView.R3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f26085i5;
                ChatActivityEnterView chatActivityEnterView2 = this.f30290b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                ff ffVar3 = chatActivityEnterView2.H0;
                if (ffVar3 != null) {
                    ffVar3.h(false);
                    chatActivityEnterView2.H0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.tn tnVar3 = chatActivityEnterView.K2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f26226z1;
                if (richMessage != null && chatActivityEnterView.A0 != null && tnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.f26226z1;
                        if (richMessage2 != null && chatActivityEnterView.A0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(th.u4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                for (y5 y5Var : y5VarArr) {
                                    y5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), p5.g());
                                }
                            }
                            qi0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    th.x1 x1Var = new th.x1(richMessage);
                    x1Var.f48852e = true;
                    x1Var.setResourceProvider(chatActivityEnterView.R3);
                    x1Var.F = tnVar3;
                    x1Var.f48869s = tnVar3.O;
                    x1Var.v = tnVar3.U;
                    x1Var.H = new ld(chatActivityEnterView, 24);
                    x1Var.G = new ld(chatActivityEnterView, 25);
                    tnVar3.presentFragment(x1Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.tn tnVar4 = chatActivityEnterView.K2;
                if (tnVar4 != null) {
                    tnVar4.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f26128g3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.R = null;
                return;
            case 24:
                jf jfVar4 = chatActivityEnterView.A0;
                if (jfVar4 != null) {
                    jfVar4.setText("");
                    return;
                }
                return;
            case 25:
                jf jfVar5 = chatActivityEnterView.A0;
                if (jfVar5 != null) {
                    jfVar5.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f26128g3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f26085i5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                String str = chatActivityEnterView.f26112e0;
                String str2 = chatActivityEnterView.f26119f0;
                org.telegram.ui.tn tnVar5 = chatActivityEnterView.K2;
                if (tnVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = tnVar5.N8();
                }
                ph.y3 b10 = ph.y3.b(i18, j10, j10, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().m(b10) != null) {
                    ph.z zVar2 = chatActivityEnterView.f26131h0;
                    if (zVar2 != null) {
                        zVar2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.mb0.l(chatActivityEnterView.f26119f0)) {
                    ?? obj = new Object();
                    obj.f50516c = new ld(chatActivityEnterView, 1);
                    ye.d.k(chatActivityEnterView.getContext(), chatActivityEnterView.f26119f0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.M).getUser(Long.valueOf(chatActivityEnterView.L2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
                    if (user != null) {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.M);
                        MessagesController.showCantOpenAlert(tnVar5, restrictionReason);
                        return;
                    }
                    ph.p2 p2Var = new ph.p2(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                    p2Var.w(false);
                    p2Var.f45986w0 = true;
                    p2Var.f45967g0 = chatActivityEnterView.J2;
                    p2Var.s(tnVar5, b10);
                    p2Var.show();
                    ph.z zVar3 = chatActivityEnterView.f26131h0;
                    if (zVar3 != null) {
                        zVar3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f26131h0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                    chatActivityEnterView.f26131h0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
