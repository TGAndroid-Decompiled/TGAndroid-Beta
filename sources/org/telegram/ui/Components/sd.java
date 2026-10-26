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
    public final int f32518a;
    public final ChatActivityEnterView f32519b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32518a = i10;
        this.f32519b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        pf pfVar;
        long X8;
        int i10 = this.f32518a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f32519b;
        switch (i10) {
            case 0:
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f25843r5;
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 4));
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
                hi.i0 i0Var = chatActivityEnterView.f25913l0;
                if (i0Var != null) {
                    i0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f35555r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f25903j2 && z10 && (pfVar = chatActivityEnterView.E0) != null) {
                    try {
                        pfVar.requestFocus();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 6:
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f25894h5 == null) {
                        dgVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar != null) {
                    mfVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                if (unVar2 == null || unVar2.isLastFragment()) {
                    chatActivityEnterView.M();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView.P1();
                return;
            case 10:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
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
                int i13 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView.J0();
                return;
            case 14:
                wc.b0(chatActivityEnterView.P2).U(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
                    return;
                }
                return;
            case 16:
                pf pfVar3 = chatActivityEnterView.E0;
                if (pfVar3 != null) {
                    pfVar3.setText("");
                }
                chatActivityEnterView.G(true);
                return;
            case 17:
                mf mfVar2 = chatActivityEnterView.L0;
                if (mfVar2 != null) {
                    mfVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                AndroidUtilities.runOnUIThread(new ie(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new qe(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f25843r5;
                ChatActivityEnterView chatActivityEnterView2 = this.f32519b;
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                mf mfVar3 = chatActivityEnterView2.L0;
                if (mfVar3 != null) {
                    mfVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && unVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.c5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class);
                            if (c6VarArr != null) {
                                for (c6 c6Var : c6VarArr) {
                                    c6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), t5.g());
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
                    li.b2 b2Var = new li.b2(richMessage);
                    b2Var.e = true;
                    b2Var.setResourceProvider(chatActivityEnterView.W3);
                    b2Var.J = unVar3;
                    b2Var.f17142s = unVar3.S;
                    b2Var.v = unVar3.Y;
                    b2Var.L = new sd(chatActivityEnterView, 24);
                    b2Var.K = new sd(chatActivityEnterView, 25);
                    unVar3.presentFragment(b2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.un unVar4 = chatActivityEnterView.P2;
                if (unVar4 != null) {
                    unVar4.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f25915l3 = false;
                chatActivityEnterView.G0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView.u1(true, true);
                chatActivityEnterView.V = null;
                return;
            case 24:
                pf pfVar4 = chatActivityEnterView.E0;
                if (pfVar4 != null) {
                    pfVar4.setText("");
                    return;
                }
                return;
            case 25:
                pf pfVar5 = chatActivityEnterView.E0;
                if (pfVar5 != null) {
                    pfVar5.setText("");
                }
                chatActivityEnterView.G(true);
                return;
            case 26:
                int i16 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView.T0();
                return;
            case 27:
                chatActivityEnterView.f25915l3 = false;
                chatActivityEnterView.G0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f25843r5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f25895i0;
                String str2 = chatActivityEnterView.f25901j0;
                org.telegram.ui.un unVar5 = chatActivityEnterView.P2;
                if (unVar5 == null) {
                    X8 = 0;
                } else {
                    X8 = unVar5.X8();
                }
                hi.c5 b10 = hi.c5.b(i18, j10, j10, str, str2, 2, 0, X8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
                    hi.i0 i0Var2 = chatActivityEnterView.f25913l0;
                    if (i0Var2 != null) {
                        i0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.lb0.q(chatActivityEnterView.f25901j0)) {
                    ?? obj = new Object();
                    obj.f47035c = new sd(chatActivityEnterView, 1);
                    qf.d.j(chatActivityEnterView.getContext(), chatActivityEnterView.f25901j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(unVar5, restrictionReason);
                        return;
                    }
                    hi.m3 m3Var = new hi.m3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    m3Var.x(false);
                    m3Var.B0 = true;
                    m3Var.f13116l0 = chatActivityEnterView.O2;
                    m3Var.t(unVar5, b10);
                    m3Var.show();
                    hi.i0 i0Var3 = chatActivityEnterView.f25913l0;
                    if (i0Var3 != null) {
                        i0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f25913l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f25913l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
