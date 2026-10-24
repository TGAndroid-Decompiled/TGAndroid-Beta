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
public final class pd implements Runnable {
    public final int f29547a;
    public final ChatActivityEnterView f29548b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29547a = i10;
        this.f29548b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        nf nfVar;
        long S8;
        int i10 = this.f29547a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f29548b;
        switch (i10) {
            case 0:
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar != null) {
                    snVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f24051r5;
                AndroidUtilities.runOnUIThread(new pd(chatActivityEnterView, 4));
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
                gi.b0 b0Var = chatActivityEnterView.f24121l0;
                if (b0Var != null) {
                    b0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f33491r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f24111j2 && z10 && (nfVar = chatActivityEnterView.E0) != null) {
                    try {
                        nfVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                bg bgVar = chatActivityEnterView.U0;
                if (bgVar != null) {
                    if (chatActivityEnterView.f24102h5 == null) {
                        bgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.sn snVar2 = chatActivityEnterView.P2;
                if (snVar2 == null || snVar2.isLastFragment()) {
                    chatActivityEnterView.M();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.P1();
                return;
            case 10:
                mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    mgVar.z(0.0f);
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
                int i13 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.J0();
                return;
            case 14:
                vc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                nf nfVar2 = chatActivityEnterView.E0;
                if (nfVar2 != null) {
                    nfVar2.setText("");
                    return;
                }
                return;
            case 16:
                nf nfVar3 = chatActivityEnterView.E0;
                if (nfVar3 != null) {
                    nfVar3.setText("");
                }
                chatActivityEnterView.F(true);
                return;
            case 17:
                kf kfVar2 = chatActivityEnterView.L0;
                if (kfVar2 != null) {
                    kfVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ge(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                d5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new oe(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f24051r5;
                ChatActivityEnterView chatActivityEnterView2 = this.f29548b;
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                kf kfVar3 = chatActivityEnterView2.L0;
                if (kfVar3 != null) {
                    kfVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.sn snVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && snVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ki.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                for (y5 y5Var : y5VarArr) {
                                    y5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), p5.g());
                                }
                            }
                            sj0.a(spannableStringBuilder);
                            chatActivityEnterView.L();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.Q0();
                            return;
                        }
                        return;
                    }
                    ki.d2 d2Var = new ki.d2(richMessage);
                    d2Var.e = true;
                    d2Var.setResourceProvider(chatActivityEnterView.W3);
                    d2Var.J = snVar3;
                    d2Var.f15277s = snVar3.S;
                    d2Var.v = snVar3.Y;
                    d2Var.L = new pd(chatActivityEnterView, 24);
                    d2Var.K = new pd(chatActivityEnterView, 25);
                    snVar3.presentFragment(d2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.sn snVar4 = chatActivityEnterView.P2;
                if (snVar4 != null) {
                    snVar4.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f24123l3 = false;
                chatActivityEnterView.G0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.u1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                nf nfVar4 = chatActivityEnterView.E0;
                if (nfVar4 != null) {
                    nfVar4.setText("");
                    return;
                }
                return;
            case 25:
                nf nfVar5 = chatActivityEnterView.E0;
                if (nfVar5 != null) {
                    nfVar5.setText("");
                }
                chatActivityEnterView.F(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.T0();
                return;
            case 27:
                chatActivityEnterView.f24123l3 = false;
                chatActivityEnterView.G0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f24051r5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f24103i0;
                String str2 = chatActivityEnterView.f24109j0;
                org.telegram.ui.sn snVar5 = chatActivityEnterView.P2;
                if (snVar5 == null) {
                    S8 = 0;
                } else {
                    S8 = snVar5.S8();
                }
                gi.t4 b10 = gi.t4.b(i18, j10, j10, str, str2, 2, 0, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
                    gi.b0 b0Var2 = chatActivityEnterView.f24121l0;
                    if (b0Var2 != null) {
                        b0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.ob0.q(chatActivityEnterView.f24109j0)) {
                    ?? obj = new Object();
                    obj.f44707c = new pd(chatActivityEnterView, 1);
                    pf.d.j(chatActivityEnterView.getContext(), chatActivityEnterView.f24109j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(snVar5, restrictionReason);
                        return;
                    }
                    gi.d3 d3Var = new gi.d3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    d3Var.x(false);
                    d3Var.B0 = true;
                    d3Var.f11171l0 = chatActivityEnterView.O2;
                    d3Var.t(snVar5, b10);
                    d3Var.show();
                    gi.b0 b0Var3 = chatActivityEnterView.f24121l0;
                    if (b0Var3 != null) {
                        b0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f24121l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f24121l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
