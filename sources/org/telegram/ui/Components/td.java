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
    public final int f29355a;
    public final ChatActivityEnterView f29356b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29355a = i10;
        this.f29356b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        rf rfVar;
        long S8;
        int i10 = this.f29355a;
        ViewGroup viewGroup = null;
        ArrayList<TLRPC.RestrictionReason> arrayList = null;
        boolean z10 = true;
        ChatActivityEnterView chatActivityEnterView = this.f29356b;
        switch (i10) {
            case 0:
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                if (foVar != null) {
                    foVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 1:
                int i11 = ChatActivityEnterView.f22849n5;
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
                fi.b0 b0Var = chatActivityEnterView.f22919l0;
                if (b0Var != null) {
                    b0Var.setOpened(false);
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.S1 = null;
                if (AndroidUtilities.isTablet()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).f32135r0;
                        if (actionBarLayout != null) {
                            viewGroup = actionBarLayout.getView();
                        }
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            z10 = false;
                        }
                    }
                }
                if (!chatActivityEnterView.f22909j2 && z10 && (rfVar = chatActivityEnterView.E0) != null) {
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
                    if (chatActivityEnterView.f22875d5 == null) {
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
                org.telegram.ui.fo foVar2 = chatActivityEnterView.P2;
                if (foVar2 == null || foVar2.isLastFragment()) {
                    chatActivityEnterView.N();
                }
                chatActivityEnterView.N4 = null;
                return;
            case 9:
                int i12 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.R1();
                return;
            case 10:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.z(0.0f);
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
                int i13 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.J0();
                return;
            case 14:
                zc.a0(chatActivityEnterView.P2).T(LocaleController.getString(R.string.BusinessLinkSaved)).j();
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
                AndroidUtilities.runOnUIThread(new je(chatActivityEnterView, 0), 600L);
                return;
            case 18:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new re(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 19:
                int i14 = ChatActivityEnterView.f22849n5;
                ChatActivityEnterView chatActivityEnterView2 = this.f29356b;
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                of ofVar3 = chatActivityEnterView2.L0;
                if (ofVar3 != null) {
                    ofVar3.h(false);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.fo foVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && foVar3 != null) {
                    if (!MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                        TL_iv.RichMessage richMessage2 = chatActivityEnterView.E1;
                        if (richMessage2 != null && chatActivityEnterView.E0 != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.g5.c(richMessage2.blocks));
                            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                            b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                            if (b6VarArr != null) {
                                for (b6 b6Var : b6VarArr) {
                                    b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                }
                            }
                            tj0.a(spannableStringBuilder);
                            chatActivityEnterView.M();
                            chatActivityEnterView.setFieldText(spannableStringBuilder);
                            chatActivityEnterView.Q0();
                            return;
                        }
                        return;
                    }
                    ji.d2 d2Var = new ji.d2(richMessage);
                    d2Var.e = true;
                    d2Var.setResourceProvider(chatActivityEnterView.W3);
                    d2Var.J = foVar3;
                    d2Var.f13219s = foVar3.S;
                    d2Var.v = foVar3.Y;
                    d2Var.L = new td(chatActivityEnterView, 24);
                    d2Var.K = new td(chatActivityEnterView, 25);
                    foVar3.presentFragment(d2Var);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.fo foVar4 = chatActivityEnterView.P2;
                if (foVar4 != null) {
                    foVar4.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar4, 43, true));
                    return;
                }
                return;
            case 22:
                chatActivityEnterView.f22921l3 = false;
                chatActivityEnterView.G0();
                return;
            case 23:
                int i15 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.v1(true, true);
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
                int i16 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.U0();
                return;
            case 27:
                chatActivityEnterView.f22921l3 = false;
                chatActivityEnterView.G0();
                return;
            case 28:
                int i17 = ChatActivityEnterView.f22849n5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f22901i0;
                String str2 = chatActivityEnterView.f22907j0;
                org.telegram.ui.fo foVar5 = chatActivityEnterView.P2;
                if (foVar5 == null) {
                    S8 = 0;
                } else {
                    S8 = foVar5.S8();
                }
                fi.e5 b10 = fi.e5.b(i18, j10, j10, str, str2, 2, 0, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    fi.b0 b0Var2 = chatActivityEnterView.f22919l0;
                    if (b0Var2 != null) {
                        b0Var2.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.jc0.q(chatActivityEnterView.f22907j0)) {
                    ?? obj = new Object();
                    obj.f43198c = new td(chatActivityEnterView, 1);
                    pf.d.k(chatActivityEnterView.getContext(), chatActivityEnterView.f22907j0, false, false, obj);
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
                        MessagesController.showCantOpenAlert(foVar5, restrictionReason);
                        return;
                    }
                    fi.k3 k3Var = new fi.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                    k3Var.x(false);
                    k3Var.A0 = true;
                    k3Var.f9365k0 = chatActivityEnterView.O2;
                    k3Var.t(foVar5, b10);
                    k3Var.show();
                    fi.b0 b0Var3 = chatActivityEnterView.f22919l0;
                    if (b0Var3 != null) {
                        b0Var3.setOpened(false);
                        return;
                    }
                    return;
                }
            default:
                if (chatActivityEnterView.f22919l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f22919l0.setOpened(false);
                    return;
                }
                return;
        }
    }
}
