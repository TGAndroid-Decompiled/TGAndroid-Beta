package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class ed implements Runnable {

    public final int f28035a;

    public final ChatActivityEnterView f28036b;

    public ed(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28035a = i10;
        this.f28036b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        bf bfVar;
        int i10 = this.f28035a;
        int i11 = 1;
        int i12 = 0;
        ChatActivityEnterView chatActivityEnterView = this.f28036b;
        switch (i10) {
            case 0:
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                if (rnVar != null) {
                    rnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
            case 1:
                int i13 = ChatActivityEnterView.f26070i5;
                AndroidUtilities.runOnUIThread(new ed(chatActivityEnterView, 4));
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
                break;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                }
                break;
            case 4:
                nh.a0 a0Var = chatActivityEnterView.f26116h0;
                if (a0Var != null) {
                    a0Var.setOpened(false);
                }
                break;
            case 5:
                chatActivityEnterView.N1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.J2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f35523n0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null && view.getVisibility() == 0) {
                            i11 = 0;
                        }
                    }
                }
                if (!chatActivityEnterView.f26099e2 && i11 != 0 && (bfVar = chatActivityEnterView.A0) != null) {
                    try {
                        bfVar.requestFocus();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                    break;
                }
                break;
            case 6:
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        qfVar.getLayoutParams().height = chatActivityEnterView.f26208y3;
                    }
                    chatActivityEnterView.Q0.setLayerType(0, null);
                }
                break;
            case 7:
                ye yeVar = chatActivityEnterView.H0;
                if (yeVar != null) {
                    yeVar.h(chatActivityEnterView.f26214z4);
                    chatActivityEnterView.H0 = null;
                }
                break;
            case 8:
                org.telegram.ui.rn rnVar2 = chatActivityEnterView.K2;
                if (rnVar2 == null || rnVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.I4 = null;
                break;
            case 9:
                int i14 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.R1();
                break;
            case 10:
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.J);
                break;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.H);
                break;
            case 13:
                int i15 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.L0();
                break;
            case 14:
                mc.a0(chatActivityEnterView.K2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                break;
            case 15:
                bf bfVar2 = chatActivityEnterView.A0;
                if (bfVar2 != null) {
                    bfVar2.setText("");
                }
                break;
            case 16:
                bf bfVar3 = chatActivityEnterView.A0;
                if (bfVar3 != null) {
                    bfVar3.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 17:
                ye yeVar2 = chatActivityEnterView.H0;
                if (yeVar2 != null) {
                    yeVar2.h(false);
                    chatActivityEnterView.H0 = null;
                }
                AndroidUtilities.runOnUIThread(new ud(chatActivityEnterView, i12), 600L);
                break;
            case 18:
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new de(chatActivityEnterView, i11), chatActivityEnterView.R3);
                break;
            case 19:
                int i16 = ChatActivityEnterView.f26070i5;
                ChatActivityEnterView chatActivityEnterView2 = this.f28036b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                ye yeVar3 = chatActivityEnterView2.H0;
                if (yeVar3 != null) {
                    yeVar3.h(false);
                    chatActivityEnterView2.H0 = null;
                }
                break;
            case 20:
                org.telegram.ui.rn rnVar3 = chatActivityEnterView.K2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f26211z1;
                if (richMessage != null && chatActivityEnterView.A0 != null && rnVar3 != null) {
                    if (MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                        rh.x1 x1Var = new rh.x1(richMessage);
                        x1Var.f47554e = true;
                        x1Var.setResourceProvider(chatActivityEnterView.R3);
                        x1Var.F = rnVar3;
                        x1Var.f47571s = rnVar3.O;
                        x1Var.v = rnVar3.U;
                        x1Var.H = new ed(chatActivityEnterView, 24);
                        x1Var.G = new ed(chatActivityEnterView, 25);
                        rnVar3.presentFragment(x1Var);
                        break;
                    } else {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.f26211z1;
                        if (richMessage2 != null && chatActivityEnterView.A0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rh.u4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                            if (t5VarArr != null) {
                                int length = t5VarArr.length;
                                while (i12 < length) {
                                    t5VarArr[i12].applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                    i12++;
                                }
                            }
                            hi0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            break;
                        }
                    }
                }
                break;
            case 21:
                org.telegram.ui.rn rnVar4 = chatActivityEnterView.K2;
                if (rnVar4 != null) {
                    rnVar4.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar4, 43, true));
                }
                break;
            case 22:
                chatActivityEnterView.f26113g3 = false;
                chatActivityEnterView.I0();
                break;
            case 23:
                int i17 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.w1(true, true);
                chatActivityEnterView.R = null;
                break;
            case 24:
                bf bfVar4 = chatActivityEnterView.A0;
                if (bfVar4 != null) {
                    bfVar4.setText("");
                }
                break;
            case 25:
                bf bfVar5 = chatActivityEnterView.A0;
                if (bfVar5 != null) {
                    bfVar5.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 26:
                int i18 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.V0();
                break;
            case 27:
                chatActivityEnterView.f26113g3 = false;
                chatActivityEnterView.I0();
                break;
            case 28:
                int i19 = ChatActivityEnterView.f26070i5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i20 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                String str = chatActivityEnterView.f26097e0;
                String str2 = chatActivityEnterView.f26104f0;
                org.telegram.ui.rn rnVar5 = chatActivityEnterView.K2;
                nh.q4 q4VarB = nh.q4.b(i20, j10, j10, str, str2, 2, 0, rnVar5 == null ? 0L : rnVar5.N8(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(q4VarB) != null) {
                    nh.a0 a0Var2 = chatActivityEnterView.f26116h0;
                    if (a0Var2 != null) {
                        a0Var2.setOpened(false);
                    }
                } else if (!org.telegram.ui.ob0.l(chatActivityEnterView.f26104f0)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.M).getUser(Long.valueOf(chatActivityEnterView.L2));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user != null ? user.restriction_reason : null);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.M);
                        MessagesController.showCantOpenAlert(rnVar5, restrictionReason);
                    } else {
                        nh.b3 b3Var = new nh.b3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                        b3Var.w(false);
                        b3Var.f18598w0 = true;
                        b3Var.f18579g0 = chatActivityEnterView.J2;
                        b3Var.s(rnVar5, q4VarB);
                        b3Var.show();
                        nh.a0 a0Var3 = chatActivityEnterView.f26116h0;
                        if (a0Var3 != null) {
                            a0Var3.setOpened(false);
                        }
                    }
                } else {
                    we.d dVar = new we.d();
                    dVar.f49294c = new ed(chatActivityEnterView, i11);
                    we.e.k(chatActivityEnterView.getContext(), chatActivityEnterView.f26104f0, false, false, dVar);
                }
                break;
            default:
                if (chatActivityEnterView.f26116h0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                    chatActivityEnterView.f26116h0.setOpened(false);
                    break;
                }
                break;
        }
    }
}
