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
public final class qd implements Runnable {
    public final int f27264a;
    public final ChatActivityEnterView f27265b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27264a = i10;
        this.f27265b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        of ofVar;
        long N8;
        int i10 = this.f27264a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f27265b;
        switch (i10) {
            case 0:
                org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                if (boVar != null) {
                    boVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f21741m5;
                AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 4));
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
                ei.c0 c0Var = chatActivityEnterView.f21810l0;
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
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f30860r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f21795i2 && z10 && (ofVar = chatActivityEnterView.E0) != null) {
                    try {
                        ofVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView.f21761c5 == null) {
                        cgVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.h(chatActivityEnterView.D4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.bo boVar2 = chatActivityEnterView.O2;
                if (boVar2 == null || boVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.M4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.S1();
                return;
            case 10:
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
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
                int i13 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.L0();
                return;
            case 14:
                vc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                of ofVar2 = chatActivityEnterView.E0;
                if (ofVar2 != null) {
                    ofVar2.setText("");
                    return;
                }
                return;
            case 16:
                of ofVar3 = chatActivityEnterView.E0;
                if (ofVar3 != null) {
                    ofVar3.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 17:
                kf kfVar2 = chatActivityEnterView.L0;
                if (kfVar2 != null) {
                    kfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ge(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                c5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new oe(chatActivityEnterView, 1), chatActivityEnterView.V3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f21741m5;
                ChatActivityEnterView chatActivityEnterView2 = this.f27265b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                kf kfVar3 = chatActivityEnterView2.L0;
                if (kfVar3 != null) {
                    kfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.bo boVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && boVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                            if (x5VarArr != null) {
                                for (x5 x5Var : x5VarArr) {
                                    x5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), o5.g());
                                }
                            }
                            ti0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    ii.d2 d2Var = new ii.d2(richMessage);
                    d2Var.e = true;
                    d2Var.setResourceProvider(chatActivityEnterView.V3);
                    d2Var.J = boVar3;
                    d2Var.f11321s = boVar3.S;
                    d2Var.v = boVar3.Y;
                    d2Var.L = new qd(chatActivityEnterView, 24);
                    d2Var.K = new qd(chatActivityEnterView, 25);
                    boVar3.presentFragment(d2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.bo boVar4 = chatActivityEnterView.O2;
                if (boVar4 != null) {
                    boVar4.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f21807k3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.w1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                of ofVar4 = chatActivityEnterView.E0;
                if (ofVar4 != null) {
                    ofVar4.setText("");
                    return;
                }
                return;
            case 25:
                of ofVar5 = chatActivityEnterView.E0;
                if (ofVar5 != null) {
                    ofVar5.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.V0();
                return;
            case 27:
                chatActivityEnterView.f21807k3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f21741m5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                String str = chatActivityEnterView.f21793i0;
                String str2 = chatActivityEnterView.f21799j0;
                org.telegram.ui.bo boVar5 = chatActivityEnterView.O2;
                if (boVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = boVar5.N8();
                }
                ei.f5 b10 = ei.f5.b(i18, j3, j3, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.f21810l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.hc0.l(chatActivityEnterView.f21799j0)) {
                    ?? obj = new Object();
                    obj.f15221c = new qd(chatActivityEnterView, 1);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f21799j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(boVar5, restrictionReason);
                        return;
                    }
                    ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                    k3Var.w(false);
                    k3Var.A0 = true;
                    k3Var.f8440k0 = chatActivityEnterView.N2;
                    k3Var.s(boVar5, b10);
                    k3Var.show();
                    ei.c0 c0Var3 = chatActivityEnterView.f21810l0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f21810l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                    chatActivityEnterView.f21810l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
