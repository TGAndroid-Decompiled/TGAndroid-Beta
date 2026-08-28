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
public final class hd implements Runnable {
    public final int f29044a;
    public final ChatActivityEnterView f29045b;

    public hd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f29044a = i9;
        this.f29045b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        ff ffVar;
        long N8;
        int i9 = this.f29044a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f29045b;
        switch (i9) {
            case 0:
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i10 = ChatActivityEnterView.f26074i5;
                AndroidUtilities.runOnUIThread(new hd(chatActivityEnterView, 4));
                return;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    return;
                }
                return;
            case 4:
                mh.c0 c0Var = chatActivityEnterView.f26120h0;
                if (c0Var != null) {
                    c0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.N1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.J2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f35520n0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f26103e2 && z10 && (ffVar = chatActivityEnterView.A0) != null) {
                    try {
                        ffVar.requestFocus();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 6:
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        ufVar.getLayoutParams().height = chatActivityEnterView.f26212y3;
                    }
                    chatActivityEnterView.Q0.setLayerType(0, null);
                    return;
                }
                return;
            case 7:
                cf cfVar = chatActivityEnterView.H0;
                if (cfVar != null) {
                    cfVar.h(chatActivityEnterView.f26218z4);
                    chatActivityEnterView.H0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.qn qnVar2 = chatActivityEnterView.K2;
                if (qnVar2 == null || qnVar2.isLastFragment()) {
                    chatActivityEnterView.O();
                }
                chatActivityEnterView.I4 = null;
                return;
            case 9:
                int i11 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.S1();
                return;
            case 10:
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 11:
                AndroidUtilities.removeFromParent(chatActivityEnterView.J);
                return;
            case 12:
                chatActivityEnterView.removeView(chatActivityEnterView.H);
                return;
            case 13:
                int i12 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.L0();
                return;
            case 14:
                oc.a0(chatActivityEnterView.K2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
                return;
            case 15:
                ff ffVar2 = chatActivityEnterView.A0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                    return;
                }
                return;
            case 16:
                ff ffVar3 = chatActivityEnterView.A0;
                if (ffVar3 != null) {
                    ffVar3.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 17:
                cf cfVar2 = chatActivityEnterView.H0;
                if (cfVar2 != null) {
                    cfVar2.h(false);
                    chatActivityEnterView.H0 = null;
                }
                AndroidUtilities.runOnUIThread(new yd(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new he(chatActivityEnterView, 1), chatActivityEnterView.R3);
                return;
            case 19:
                int i13 = ChatActivityEnterView.f26074i5;
                ChatActivityEnterView chatActivityEnterView2 = this.f29045b;
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                cf cfVar3 = chatActivityEnterView2.H0;
                if (cfVar3 != null) {
                    cfVar3.h(false);
                    chatActivityEnterView2.H0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.qn qnVar3 = chatActivityEnterView.K2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f26215z1;
                if (richMessage != null && chatActivityEnterView.A0 != null && qnVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.f26215z1;
                        if (richMessage2 != null && chatActivityEnterView.A0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qh.t4.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                            if (t5VarArr != null) {
                                for (t5 t5Var : t5VarArr) {
                                    t5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                }
                            }
                            fi0.a(spannableStringBuilder);
                            chatActivityEnterView.N();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.S0();
                            return;
                        }
                        return;
                    }
                    qh.x1 x1Var = new qh.x1(richMessage);
                    x1Var.f46798e = true;
                    x1Var.setResourceProvider(chatActivityEnterView.R3);
                    x1Var.F = qnVar3;
                    x1Var.f46815s = qnVar3.O;
                    x1Var.v = qnVar3.U;
                    x1Var.H = new hd(chatActivityEnterView, 24);
                    x1Var.G = new hd(chatActivityEnterView, 25);
                    qnVar3.presentFragment(x1Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.qn qnVar4 = chatActivityEnterView.K2;
                if (qnVar4 != null) {
                    qnVar4.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f26117g3 = false;
                chatActivityEnterView.H0();
                return;
            case 23:
                int i14 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.R = null;
                return;
            case 24:
                ff ffVar4 = chatActivityEnterView.A0;
                if (ffVar4 != null) {
                    ffVar4.setText("");
                    return;
                }
                return;
            case 25:
                ff ffVar5 = chatActivityEnterView.A0;
                if (ffVar5 != null) {
                    ffVar5.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 26:
                int i15 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.W0();
                return;
            case 27:
                chatActivityEnterView.f26117g3 = false;
                chatActivityEnterView.H0();
                return;
            case 28:
                int i16 = ChatActivityEnterView.f26074i5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i17 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                String str = chatActivityEnterView.f26101e0;
                String str2 = chatActivityEnterView.f26108f0;
                org.telegram.ui.qn qnVar5 = chatActivityEnterView.K2;
                if (qnVar5 == null) {
                    N8 = 0;
                } else {
                    N8 = qnVar5.N8();
                }
                mh.s4 b10 = mh.s4.b(i17, j10, j10, str, str2, 2, 0, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(b10) != null) {
                    mh.c0 c0Var2 = chatActivityEnterView.f26120h0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.kb0.l(chatActivityEnterView.f26108f0)) {
                    ?? obj = new Object();
                    obj.f48383c = new hd(chatActivityEnterView, 1);
                    ve.e.k(chatActivityEnterView.getContext(), chatActivityEnterView.f26108f0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.M).getUser(Long.valueOf(chatActivityEnterView.L2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
                    if (user != null) {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.M);
                        MessagesController.showCantOpenAlert(qnVar5, restrictionReason);
                        return;
                    }
                    mh.c3 c3Var = new mh.c3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                    c3Var.w(false);
                    c3Var.f17777w0 = true;
                    c3Var.f17758g0 = chatActivityEnterView.J2;
                    c3Var.s(qnVar5, b10);
                    c3Var.show();
                    mh.c0 c0Var3 = chatActivityEnterView.f26120h0;
                    if (c0Var3 != null) {
                        c0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f26120h0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                    chatActivityEnterView.f26120h0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
