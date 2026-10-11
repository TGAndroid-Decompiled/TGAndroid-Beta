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
public final class vd implements Runnable {
    public final int f31744a;
    public final ChatActivityEnterView f31745b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31744a = i10;
        this.f31745b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        sf sfVar;
        long S8;
        int i10 = this.f31744a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f31745b;
        switch (i10) {
            case 0:
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f23842n5;
                AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 4));
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
                ei.c0 c0Var = chatActivityEnterView.f23912l0;
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
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f33837r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f23903j2 && z10 && (sfVar = chatActivityEnterView.E0) != null) {
                    try {
                        sfVar.requestFocus();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 6:
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView.f23868d5 == null) {
                        ggVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                pf pfVar = chatActivityEnterView.L0;
                if (pfVar != null) {
                    pfVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                if (znVar2 == null || znVar2.isLastFragment()) {
                    chatActivityEnterView.N();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.R1();
                return;
            case 10:
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
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
                int i13 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.J0();
                return;
            case 14:
                ad.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                sf sfVar2 = chatActivityEnterView.E0;
                if (sfVar2 != null) {
                    sfVar2.setText("");
                    return;
                }
                return;
            case 16:
                sf sfVar3 = chatActivityEnterView.E0;
                if (sfVar3 != null) {
                    sfVar3.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 17:
                pf pfVar2 = chatActivityEnterView.L0;
                if (pfVar2 != null) {
                    pfVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new le(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new te(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f23842n5;
                ChatActivityEnterView chatActivityEnterView2 = this.f31745b;
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                pf pfVar3 = chatActivityEnterView2.L0;
                if (pfVar3 != null) {
                    pfVar3.h(false);
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
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                            if (b6VarArr != null) {
                                for (b6 b6Var : b6VarArr) {
                                    b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                }
                            }
                            zj0.a(spannableStringBuilder);
                            chatActivityEnterView.M();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.Q0();
                            return;
                        }
                        return;
                    }
                    ii.e2 e2Var = new ii.e2(richMessage);
                    e2Var.f12364e = true;
                    e2Var.setResourceProvider(chatActivityEnterView.W3);
                    e2Var.J = znVar3;
                    e2Var.f12381s = znVar3.S;
                    e2Var.v = znVar3.Y;
                    e2Var.L = new vd(chatActivityEnterView, 24);
                    e2Var.K = new vd(chatActivityEnterView, 25);
                    znVar3.presentFragment(e2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.zn znVar4 = chatActivityEnterView.P2;
                if (znVar4 != null) {
                    znVar4.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f23914l3 = false;
                chatActivityEnterView.G0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.v1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                sf sfVar4 = chatActivityEnterView.E0;
                if (sfVar4 != null) {
                    sfVar4.setText("");
                    return;
                }
                return;
            case 25:
                sf sfVar5 = chatActivityEnterView.E0;
                if (sfVar5 != null) {
                    sfVar5.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.U0();
                return;
            case 27:
                chatActivityEnterView.f23914l3 = false;
                chatActivityEnterView.G0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f23842n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f23895i0;
                String str2 = chatActivityEnterView.f23901j0;
                org.telegram.ui.zn znVar5 = chatActivityEnterView.P2;
                if (znVar5 == null) {
                    S8 = 0;
                } else {
                    S8 = znVar5.S8();
                }
                ei.e5 b10 = ei.e5.b(i18, j3, j3, str, str2, 2, 0, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var2 = chatActivityEnterView.f23912l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.dc0.q(chatActivityEnterView.f23901j0)) {
                    ?? obj = new Object();
                    obj.f17169c = new vd(chatActivityEnterView, 1);
                    of.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f23901j0, false, false, obj);
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
                    k3Var.x(false);
                    k3Var.A0 = true;
                    k3Var.f9166k0 = chatActivityEnterView.O2;
                    k3Var.t(znVar5, b10);
                    k3Var.show();
                    ei.c0 c0Var3 = chatActivityEnterView.f23912l0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f23912l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f23912l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
