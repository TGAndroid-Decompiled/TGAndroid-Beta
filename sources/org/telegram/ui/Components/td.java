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
public final class td implements Runnable {
    public final int f28520a;
    public final ChatActivityEnterView f28521b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28520a = i10;
        this.f28521b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        qf qfVar;
        long N8;
        int i10 = this.f28520a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f28521b;
        switch (i10) {
            case 0:
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f21952n5;
                AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 4));
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
                ei.c0 c0Var = chatActivityEnterView.f22021l0;
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
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f31131r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f22012j2 && z10 && (qfVar = chatActivityEnterView.E0) != null) {
                    try {
                        qfVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.f21978d5 == null) {
                        egVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar != null) {
                    nfVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.wn wnVar2 = chatActivityEnterView.P2;
                if (wnVar2 == null || wnVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.S1();
                return;
            case 10:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
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
                int i13 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.L0();
                return;
            case 14:
                xc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
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
                AndroidUtilities.runOnUIThread(new je(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new re(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f21952n5;
                ChatActivityEnterView chatActivityEnterView2 = this.f28521b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                nf nfVar3 = chatActivityEnterView2.L0;
                if (nfVar3 != null) {
                    nfVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.wn wnVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && wnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.d5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                            if (z5VarArr != null) {
                                for (z5 z5Var : z5VarArr) {
                                    z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                }
                            }
                            ej0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    ii.e2 e2Var = new ii.e2(richMessage);
                    e2Var.e = true;
                    e2Var.setResourceProvider(chatActivityEnterView.W3);
                    e2Var.J = wnVar3;
                    e2Var.f11330s = wnVar3.S;
                    e2Var.v = wnVar3.Y;
                    e2Var.L = new td(chatActivityEnterView, 24);
                    e2Var.K = new td(chatActivityEnterView, 25);
                    wnVar3.presentFragment(e2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.wn wnVar4 = chatActivityEnterView.P2;
                if (wnVar4 != null) {
                    wnVar4.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f22023l3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f21952n5;
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
                int i16 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f22023l3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f21952n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f22004i0;
                String str2 = chatActivityEnterView.f22010j0;
                org.telegram.ui.wn wnVar5 = chatActivityEnterView.P2;
                if (wnVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = wnVar5.N8();
                }
                ei.f5 b10 = ei.f5.b(i18, j3, j3, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.f22021l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.zb0.l(chatActivityEnterView.f22010j0)) {
                    ?? obj = new Object();
                    obj.f15438c = new td(chatActivityEnterView, 1);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f22010j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(wnVar5, restrictionReason);
                        return;
                    }
                    ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    k3Var.w(false);
                    k3Var.A0 = true;
                    k3Var.f8422k0 = chatActivityEnterView.O2;
                    k3Var.s(wnVar5, b10);
                    k3Var.show();
                    ei.c0 c0Var3 = chatActivityEnterView.f22021l0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f22021l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f22021l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
