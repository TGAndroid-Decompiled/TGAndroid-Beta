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
    public final int f31021a;
    public final ChatActivityEnterView f31022b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31021a = i10;
        this.f31022b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        rf rfVar;
        long O8;
        int i10 = this.f31021a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f31022b;
        switch (i10) {
            case 0:
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                if (ynVar != null) {
                    ynVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f23846n5;
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
                ei.d0 d0Var = chatActivityEnterView.f23916l0;
                if (d0Var != null) {
                    d0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f33799r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f23907j2 && z10 && (rfVar = chatActivityEnterView.E0) != null) {
                    try {
                        rfVar.requestFocus();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 6:
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f23872d5 == null) {
                        fgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.h(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.yn ynVar2 = chatActivityEnterView.P2;
                if (ynVar2 == null || ynVar2.isLastFragment()) {
                    chatActivityEnterView.N();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.S1();
                return;
            case 10:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
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
                int i13 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.L0();
                return;
            case 14:
                yc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                rf rfVar2 = chatActivityEnterView.E0;
                if (rfVar2 != null) {
                    rfVar2.setText("");
                    return;
                }
                return;
            case 16:
                rf rfVar3 = chatActivityEnterView.E0;
                if (rfVar3 != null) {
                    rfVar3.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 17:
                of ofVar2 = chatActivityEnterView.L0;
                if (ofVar2 != null) {
                    ofVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ke(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new se(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f23846n5;
                ChatActivityEnterView chatActivityEnterView2 = this.f31022b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                of ofVar3 = chatActivityEnterView2.L0;
                if (ofVar3 != null) {
                    ofVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.yn ynVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && ynVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                            if (z5VarArr != null) {
                                for (z5 z5Var : z5VarArr) {
                                    z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                }
                            }
                            fj0.a(spannableStringBuilder);
                            chatActivityEnterView.M();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    ii.e2 e2Var = new ii.e2(richMessage);
                    e2Var.f12319e = true;
                    e2Var.setResourceProvider(chatActivityEnterView.W3);
                    e2Var.J = ynVar3;
                    e2Var.f12336s = ynVar3.Q;
                    e2Var.v = ynVar3.W;
                    e2Var.L = new td(chatActivityEnterView, 24);
                    e2Var.K = new td(chatActivityEnterView, 25);
                    ynVar3.presentFragment(e2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.yn ynVar4 = chatActivityEnterView.P2;
                if (ynVar4 != null) {
                    ynVar4.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f23918l3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.w1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                rf rfVar4 = chatActivityEnterView.E0;
                if (rfVar4 != null) {
                    rfVar4.setText("");
                    return;
                }
                return;
            case 25:
                rf rfVar5 = chatActivityEnterView.E0;
                if (rfVar5 != null) {
                    rfVar5.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.V0();
                return;
            case 27:
                chatActivityEnterView.f23918l3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f23846n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f23899i0;
                String str2 = chatActivityEnterView.f23905j0;
                org.telegram.ui.yn ynVar5 = chatActivityEnterView.P2;
                if (ynVar5 == null) {
                    O8 = 0;
                } else {
                    O8 = ynVar5.O8();
                }
                ei.f5 b10 = ei.f5.b(i18, j3, j3, str, str2, 2, 0, O8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.d0 d0Var2 = chatActivityEnterView.f23916l0;
                    if (d0Var2 != null) {
                        d0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.dc0.l(chatActivityEnterView.f23905j0)) {
                    ?? obj = new Object();
                    obj.f16877c = new td(chatActivityEnterView, 1);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f23905j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(ynVar5, restrictionReason);
                        return;
                    }
                    ei.l3 l3Var = new ei.l3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    l3Var.w(false);
                    l3Var.A0 = true;
                    l3Var.f9164k0 = chatActivityEnterView.O2;
                    l3Var.s(ynVar5, b10);
                    l3Var.show();
                    ei.d0 d0Var3 = chatActivityEnterView.f23916l0;
                    if (d0Var3 != null) {
                        d0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f23916l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f23916l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
