package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ud implements Runnable {
    public final int f31143a;
    public final ChatActivityEnterView f31144b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31143a = i10;
        this.f31144b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        uf ufVar;
        int i10 = this.f31143a;
        ViewGroup viewGroup = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f31144b;
        switch (i10) {
            case 0:
                uf ufVar2 = chatActivityEnterView.E0;
                if (ufVar2 != null) {
                    ufVar2.setText("");
                    return;
                }
                return;
            case 1:
                uf ufVar3 = chatActivityEnterView.E0;
                if (ufVar3 != null) {
                    ufVar3.setText("");
                }
                chatActivityEnterView.L(true);
                return;
            case 2:
                org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 5:
                int i11 = ChatActivityEnterView.Q5;
                AndroidUtilities.runOnUIThread(new ud(chatActivityEnterView, 6));
                return;
            case 6:
                ei.c0 c0Var = chatActivityEnterView.f23685l0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    return;
                }
                return;
            case 7:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f33646r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f23676j2 && z10 && (ufVar = chatActivityEnterView.E0) != null) {
                    try {
                        ufVar.requestFocus();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 8:
                if (chatActivityEnterView.f23671i3 && !chatActivityEnterView.Y1 && chatActivityEnterView.f23626b3 != null) {
                    chatActivityEnterView.A1();
                    return;
                }
                return;
            case 9:
                ig igVar = chatActivityEnterView.U0;
                if (igVar != null) {
                    if (chatActivityEnterView.G5 == null) {
                        igVar.getLayoutParams().height = chatActivityEnterView.f23654f4;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.eo eoVar2 = chatActivityEnterView.P2;
                if (eoVar2 == null || eoVar2.isLastFragment()) {
                    chatActivityEnterView.Q();
                }
                chatActivityEnterView.f23717q5 = null;
                return;
            case 11:
                int i12 = ChatActivityEnterView.Q5;
                chatActivityEnterView.V1();
                return;
            case 12:
                rl0 rl0Var = chatActivityEnterView.f23665h3;
                if (rl0Var != null && rl0Var.getVisibility() == 0) {
                    chatActivityEnterView.B(false);
                    rl0 rl0Var2 = chatActivityEnterView.f23665h3;
                    rl0Var2.K = false;
                    rl0Var2.I = false;
                    rl0Var2.H = false;
                    rl0Var2.J = true;
                    rl0Var2.c();
                    rl0Var2.e();
                    chatActivityEnterView.U1();
                    chatActivityEnterView.J0.invalidate();
                    return;
                }
                return;
            case 13:
                sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 14:
                AndroidUtilities.removeFromParent(chatActivityEnterView.N);
                return;
            case 15:
                int i13 = ChatActivityEnterView.Q5;
                chatActivityEnterView.N0();
                return;
            case 16:
                chatActivityEnterView.removeView(chatActivityEnterView.L);
                return;
            case 17:
                chatActivityEnterView.N3 = false;
                chatActivityEnterView.K0();
                return;
            case 18:
                zc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 19:
                uf ufVar4 = chatActivityEnterView.E0;
                if (ufVar4 != null) {
                    ufVar4.setText("");
                    return;
                }
                return;
            case 20:
                uf ufVar5 = chatActivityEnterView.E0;
                if (ufVar5 != null) {
                    ufVar5.setText("");
                }
                chatActivityEnterView.L(true);
                return;
            case 21:
                rf rfVar = chatActivityEnterView.L0;
                if (rfVar != null) {
                    rfVar.h(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, 4), 600L);
                return;
            case 22:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new te(chatActivityEnterView, 1), chatActivityEnterView.f23774z4);
                return;
            case 23:
                int i14 = ChatActivityEnterView.Q5;
                ChatActivityEnterView chatActivityEnterView2 = this.f31144b;
                chatActivityEnterView2.W0(2147483646, true, 0, true, 0L);
                rf rfVar2 = chatActivityEnterView2.L0;
                if (rfVar2 != null) {
                    rfVar2.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.eo eoVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && eoVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.d5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                            if (b6VarArr != null) {
                                for (b6 b6Var : b6VarArr) {
                                    b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                }
                            }
                            ak0.a(spannableStringBuilder);
                            chatActivityEnterView.P();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.V0();
                            return;
                        }
                        return;
                    }
                    ii.e2 e2Var = new ii.e2(richMessage);
                    e2Var.f12367e = true;
                    e2Var.setResourceProvider(chatActivityEnterView.f23774z4);
                    e2Var.J = eoVar3;
                    e2Var.f12384s = eoVar3.S;
                    e2Var.v = eoVar3.Y;
                    e2Var.L = new ie(chatActivityEnterView, 0);
                    e2Var.K = new ie(chatActivityEnterView, 1);
                    eoVar3.presentFragment(e2Var);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.eo eoVar4 = chatActivityEnterView.P2;
                if (eoVar4 != null) {
                    eoVar4.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar4, 43, true));
                    return;
                }
                return;
            case 26:
                rf rfVar3 = chatActivityEnterView.L0;
                if (rfVar3 != null) {
                    rfVar3.h(chatActivityEnterView.f23667h5);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 27:
                int i15 = ChatActivityEnterView.Q5;
                chatActivityEnterView.z1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 28:
                chatActivityEnterView.f23707p0.callOnClick();
                return;
            default:
                chatActivityEnterView.f23707p0.callOnClick();
                return;
        }
    }
}
