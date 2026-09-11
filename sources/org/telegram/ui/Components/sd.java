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
    public final int f30252a;
    public final ChatActivityEnterView f30253b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30252a = i10;
        this.f30253b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        qf qfVar;
        long N8;
        int i10 = this.f30252a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f30253b;
        switch (i10) {
            case 0:
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar != null) {
                    coVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f23661m5;
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 4));
                return;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 4:
                fi.c0 c0Var = chatActivityEnterView.f23731l0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.R1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.N2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f33455r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f23716i2 && z10 && (qfVar = chatActivityEnterView.E0) != null) {
                    try {
                        qfVar.requestFocus();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 6:
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.f23681c5 == null) {
                        egVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar != null) {
                    nfVar.h(chatActivityEnterView.D4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.co coVar2 = chatActivityEnterView.O2;
                if (coVar2 == null || coVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.M4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.S1();
                return;
            case 10:
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
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
                int i13 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.L0();
                return;
            case 14:
                yc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                qf qfVar2 = chatActivityEnterView.E0;
                if (qfVar2 != null) {
                    qfVar2.setText("");
                    return;
                }
                return;
            case 16:
                qf qfVar3 = chatActivityEnterView.E0;
                if (qfVar3 != null) {
                    qfVar3.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 17:
                nf nfVar2 = chatActivityEnterView.L0;
                if (nfVar2 != null) {
                    nfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new qe(chatActivityEnterView, 1), chatActivityEnterView.V3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f23661m5;
                ChatActivityEnterView chatActivityEnterView2 = this.f30253b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                nf nfVar3 = chatActivityEnterView2.L0;
                if (nfVar3 != null) {
                    nfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.co coVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && coVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.f5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                            if (z5VarArr != null) {
                                for (z5 z5Var : z5VarArr) {
                                    z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                }
                            }
                            si0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    ji.c2 c2Var = new ji.c2(richMessage);
                    c2Var.f13813e = true;
                    c2Var.setResourceProvider(chatActivityEnterView.V3);
                    c2Var.J = coVar3;
                    c2Var.f13830s = coVar3.S;
                    c2Var.v = coVar3.Y;
                    c2Var.L = new sd(chatActivityEnterView, 24);
                    c2Var.K = new sd(chatActivityEnterView, 25);
                    coVar3.presentFragment(c2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.co coVar4 = chatActivityEnterView.O2;
                if (coVar4 != null) {
                    coVar4.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f23728k3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                qf qfVar4 = chatActivityEnterView.E0;
                if (qfVar4 != null) {
                    qfVar4.setText("");
                    return;
                }
                return;
            case 25:
                qf qfVar5 = chatActivityEnterView.E0;
                if (qfVar5 != null) {
                    qfVar5.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f23728k3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f23661m5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                String str = chatActivityEnterView.f23714i0;
                String str2 = chatActivityEnterView.f23720j0;
                org.telegram.ui.co coVar5 = chatActivityEnterView.O2;
                if (coVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = coVar5.N8();
                }
                fi.f5 b10 = fi.f5.b(i18, j3, j3, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    fi.c0 c0Var2 = chatActivityEnterView.f23731l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.fc0.l(chatActivityEnterView.f23720j0)) {
                    ?? obj = new Object();
                    obj.f17005c = new sd(chatActivityEnterView, 1);
                    of.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f23720j0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.P2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
                    if (user != null) {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(coVar5, restrictionReason);
                        return;
                    }
                    fi.k3 k3Var = new fi.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                    k3Var.w(false);
                    k3Var.A0 = true;
                    k3Var.f9773k0 = chatActivityEnterView.N2;
                    k3Var.s(coVar5, b10);
                    k3Var.show();
                    fi.c0 c0Var3 = chatActivityEnterView.f23731l0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f23731l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                    chatActivityEnterView.f23731l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
