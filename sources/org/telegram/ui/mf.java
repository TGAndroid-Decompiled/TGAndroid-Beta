package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class mf implements Runnable {
    public final int f39154a;
    public final sn f39155b;

    public mf(sn snVar, int i10) {
        this.f39154a = i10;
        this.f39155b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        hk hkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f39154a;
        sn snVar = this.f39155b;
        switch (i10) {
            case 0:
                snVar.D7(true);
                return;
            case 1:
                snVar.D7(true);
                return;
            case 2:
                snVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new qe(snVar, 2));
                y0Var.show();
                return;
            case 3:
                sn.U(snVar);
                return;
            case 4:
                sn.f0(snVar);
                return;
            case 5:
                if (snVar.getUserConfig().isPremium()) {
                    snVar.Mb = null;
                    snVar.Uc(true);
                    org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    snVar.getMessagesController().disableAds(true);
                    return;
                }
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
                return;
            case 6:
                hk hkVar2 = snVar.Y;
                if (hkVar2 != null) {
                    hkVar2.o0(true);
                    return;
                }
                return;
            case 7:
                snVar.f41336qa = null;
                snVar.f41324pa = -1;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = snVar.f41386u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                snVar.f41272l6 = 0;
                snVar.getMessagesController().markMentionsAsRead(snVar.T5, snVar.d());
                snVar.f41284m6 = true;
                snVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = snVar.f41386u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                snVar.l1 = 0;
                snVar.Fc(true);
                snVar.getMessagesController().markReactionsAsRead(snVar.T5, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = snVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = snVar.f41386u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                snVar.f41279m1 = 0;
                snVar.Ec(true);
                snVar.getMessagesController().markPollVotesAsRead(snVar.T5, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = snVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                snVar.Y.F0();
                return;
            case 12:
                sn.g0(snVar);
                return;
            case 13:
                snVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                snVar.j8(false, true, 0.0f);
                return;
            case 16:
                snVar.G5 = null;
                snVar.m8();
                return;
            case 17:
                snVar.G5 = null;
                snVar.m8();
                return;
            case 18:
                snVar.finishFragment();
                return;
            case 19:
                snVar.j8(false, true, 0.0f);
                return;
            case 20:
                snVar.C4 = null;
                snVar.t9();
                snVar.w9();
                return;
            case 21:
                snVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    snVar.S8[0].performAccessibilityAction(64, null);
                    snVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(snVar.getParentActivity(), 3, snVar.f41191ea);
                snVar.f41325pb = b2Var;
                b2Var.setOnShowListener(new kf(snVar, 1));
                snVar.f41325pb.setOnCancelListener(snVar.f41288ma);
                snVar.f41325pb.q(500L);
                return;
            case 24:
                kk kkVar = snVar.f41375t8;
                if (kkVar != null && kkVar.getParent() != null) {
                    snVar.f41419x0.f1();
                    snVar.f41400v8.setDrawingReady(false);
                    snVar.f41375t8.setTag(null);
                    snVar.X0.removeView(snVar.f41375t8);
                    return;
                }
                return;
            case 25:
                snVar.f41314o9 = false;
                snVar.j9(true);
                return;
            case 26:
                snVar.f41333q7 = null;
                org.telegram.ui.Components.r60 r60Var = snVar.f41146b3;
                if (r60Var != null) {
                    org.telegram.ui.Components.o60 cameraContainer = r60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(snVar.f41146b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(snVar.f41146b3.getPaint(), org.telegram.ui.Components.t6.f30472b, 0), ObjectAnimator.ofFloat(snVar.f41146b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new qi(snVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && (hkVar = snVar.Y) != null && (sendButton = hkVar.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (snVar.f41208g2 == null) {
                        cj cjVar = new cj(4, 0, snVar.getParentActivity(), snVar.f41191ea, false);
                        snVar.f41208g2 = cjVar;
                        cjVar.a();
                        snVar.f41208g2.setAlpha(0.0f);
                        snVar.f41208g2.setVisibility(4);
                        snVar.f41208g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        snVar.X0.addView(snVar.f41208g2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.f41208g2.f(sendButton, true);
                    snVar.f41221h2 = true;
                    return;
                }
                return;
            case 28:
                snVar.A0.M.clear();
                fm fmVar = snVar.A0;
                fmVar.L = false;
                fmVar.O(true);
                snVar.Tb(false);
                return;
            default:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && snVar.Y != null && snVar.Fa == null && snVar.getMessagesController().getSendPaidMessagesStars(snVar.a()) <= 0 && (sendButton2 = snVar.Y.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (snVar.f41232i2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, snVar.getParentActivity(), snVar.f41191ea, false);
                        snVar.f41232i2 = r40Var;
                        r40Var.a();
                        snVar.f41232i2.setAlpha(0.0f);
                        snVar.f41232i2.setVisibility(4);
                        snVar.f41232i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        snVar.X0.addView(snVar.f41232i2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.f41232i2.f(sendButton2, true);
                    snVar.f41244j2 = true;
                    return;
                }
                return;
        }
    }
}
