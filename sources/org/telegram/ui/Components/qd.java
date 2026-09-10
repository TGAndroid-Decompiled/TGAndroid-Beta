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
    public final int f26394a;
    public final ChatActivityEnterView f26395b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26394a = i10;
        this.f26395b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        rf rfVar;
        long N8;
        int i10 = this.f26394a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f26395b;
        switch (i10) {
            case 0:
                org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f20816m5;
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
                di.f0 f0Var = chatActivityEnterView.f20885l0;
                if (f0Var != null) {
                    f0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.R1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.N2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f29959r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f20870i2 && z10 && (rfVar = chatActivityEnterView.E0) != null) {
                    try {
                        rfVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f20836c5 == null) {
                        fgVar.getLayoutParams().height = chatActivityEnterView.C3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.h(chatActivityEnterView.D4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.eo eoVar2 = chatActivityEnterView.O2;
                if (eoVar2 == null || eoVar2.isLastFragment()) {
                    chatActivityEnterView.P();
                }
                chatActivityEnterView.M4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.S1();
                return;
            case 10:
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.y(0.0f);
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
                int i13 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.L0();
                return;
            case 14:
                wc.a0(chatActivityEnterView.O2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
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
                chatActivityEnterView.K(true);
                return;
            case 17:
                of ofVar2 = chatActivityEnterView.L0;
                if (ofVar2 != null) {
                    ofVar2.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                d5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new re(chatActivityEnterView, 1), chatActivityEnterView.V3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f20816m5;
                ChatActivityEnterView chatActivityEnterView2 = this.f26395b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                of ofVar3 = chatActivityEnterView2.L0;
                if (ofVar3 != null) {
                    ofVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.eo eoVar3 = chatActivityEnterView.O2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.D1;
                if (richMessage != null && chatActivityEnterView.E0 != null && eoVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.D1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hi.f5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                            if (y5VarArr != null) {
                                for (y5 y5Var : y5VarArr) {
                                    y5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), p5.g());
                                }
                            }
                            cj0.a(spannableStringBuilder);
                            chatActivityEnterView.O();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    hi.g2 g2Var = new hi.g2(richMessage);
                    g2Var.e = true;
                    g2Var.setResourceProvider(chatActivityEnterView.V3);
                    g2Var.J = eoVar3;
                    g2Var.f9602s = eoVar3.S;
                    g2Var.v = eoVar3.Y;
                    g2Var.L = new qd(chatActivityEnterView, 24);
                    g2Var.K = new qd(chatActivityEnterView, 25);
                    eoVar3.presentFragment(g2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.eo eoVar4 = chatActivityEnterView.O2;
                if (eoVar4 != null) {
                    eoVar4.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f20882k3 = false;
                chatActivityEnterView.I0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.x1(true, true);
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
                chatActivityEnterView.K(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f20882k3 = false;
                chatActivityEnterView.I0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f20816m5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                String str = chatActivityEnterView.f20868i0;
                String str2 = chatActivityEnterView.f20874j0;
                org.telegram.ui.eo eoVar5 = chatActivityEnterView.O2;
                if (eoVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = eoVar5.N8();
                }
                di.j5 b10 = di.j5.b(i18, j3, j3, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    di.f0 f0Var2 = chatActivityEnterView.f20885l0;
                    if (f0Var2 != null) {
                        f0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.fc0.l(chatActivityEnterView.f20874j0)) {
                    ?? obj = new Object();
                    obj.f14041c = new qd(chatActivityEnterView, 1);
                    nf.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f20874j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(eoVar5, restrictionReason);
                        return;
                    }
                    di.n3 n3Var = new di.n3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                    n3Var.w(false);
                    n3Var.A0 = true;
                    n3Var.f6796k0 = chatActivityEnterView.N2;
                    n3Var.s(eoVar5, b10);
                    n3Var.show();
                    di.f0 f0Var3 = chatActivityEnterView.f20885l0;
                    if (f0Var3 != null) {
                        f0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f20885l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                    chatActivityEnterView.f20885l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
