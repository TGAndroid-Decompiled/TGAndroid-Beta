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
public final class kf implements Runnable {
    public final int f38939a;
    public final sn f38940b;

    public kf(sn snVar, int i10) {
        this.f38939a = i10;
        this.f38940b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        gk gkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f38939a;
        sn snVar = this.f38940b;
        switch (i10) {
            case 0:
                snVar.D7(true);
                return;
            case 1:
                snVar.D7(true);
                return;
            case 2:
                snVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new oe(snVar, 2));
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
                    snVar.Zb = null;
                    snVar.Xc(true);
                    org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    snVar.getMessagesController().disableAds(true);
                    return;
                }
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 3, true));
                return;
            case 6:
                gk gkVar2 = snVar.Y;
                if (gkVar2 != null) {
                    gkVar2.n0(true);
                    return;
                }
                return;
            case 7:
                snVar.Ca = null;
                snVar.Ba = -1;
                View view = snVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = snVar.G6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                snVar.f41743x6 = 0;
                snVar.getMessagesController().markMentionsAsRead(snVar.f41519f6, snVar.d());
                snVar.f41756y6 = true;
                snVar.Qb(false);
                org.telegram.ui.ActionBar.m1 m1Var = snVar.f41484c9;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = snVar.G6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                snVar.f41738x1 = 0;
                snVar.Ic(true);
                snVar.getMessagesController().markReactionsAsRead(snVar.f41519f6, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = snVar.f41484c9;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = snVar.G6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                snVar.f41752y1 = 0;
                snVar.Hc(true);
                snVar.getMessagesController().markPollVotesAsRead(snVar.f41519f6, snVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = snVar.f41484c9;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                snVar.Y.F0();
                return;
            case 12:
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 13:
                sn.g0(snVar);
                return;
            case 14:
                snVar.j8(false, true, 0.0f);
                return;
            case 15:
                snVar.finishFragment();
                return;
            case 16:
                snVar.j8(false, true, 0.0f);
                return;
            case 17:
                snVar.V6();
                return;
            case 18:
                snVar.S5 = null;
                snVar.m8();
                return;
            case 19:
                snVar.S5 = null;
                snVar.m8();
                return;
            case 20:
                snVar.j8(false, true, 0.0f);
                return;
            case 21:
                jk jkVar = snVar.F8;
                if (jkVar != null && jkVar.getParent() != null) {
                    snVar.f41737x0.g1();
                    snVar.H8.setDrawingReady(false);
                    snVar.F8.setTag(null);
                    snVar.f41561j1.removeView(snVar.F8);
                    return;
                }
                return;
            case 22:
                snVar.O4 = null;
                snVar.t9();
                snVar.w9();
                return;
            case 23:
                org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.f41508e9;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    snVar.f41508e9[0].performAccessibilityAction(64, null);
                    snVar.f41508e9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(snVar.getParentActivity(), 3, snVar.f41654qa);
                snVar.Cb = c2Var;
                c2Var.setOnShowListener(new hf(snVar, 1));
                snVar.Cb.setOnCancelListener(snVar.f41760ya);
                snVar.Cb.r(500L);
                return;
            case 25:
                snVar.A9 = false;
                snVar.j9(true);
                return;
            case 26:
                snVar.C7 = null;
                org.telegram.ui.Components.s60 s60Var = snVar.f41613n3;
                if (s60Var != null) {
                    org.telegram.ui.Components.p60 cameraContainer = s60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(snVar.f41613n3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(snVar.f41613n3.getPaint(), org.telegram.ui.Components.t6.f30650b, 0), ObjectAnimator.ofFloat(snVar.f41613n3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new oi(snVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && (gkVar = snVar.Y) != null && (sendButton = gkVar.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (snVar.f41674s2 == null) {
                        aj ajVar = new aj(4, 0, snVar.getParentActivity(), snVar.f41654qa, false);
                        snVar.f41674s2 = ajVar;
                        ajVar.a();
                        snVar.f41674s2.setAlpha(0.0f);
                        snVar.f41674s2.setVisibility(4);
                        snVar.f41674s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        snVar.f41561j1.addView(snVar.f41674s2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.f41674s2.f(sendButton, true);
                    snVar.f41687t2 = true;
                    return;
                }
                return;
            case 28:
                snVar.A0.M.clear();
                em emVar = snVar.A0;
                emVar.L = false;
                emVar.O(true);
                snVar.Vb(false);
                return;
            default:
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && snVar.Y != null && snVar.Ra == null && snVar.getMessagesController().getSendPaidMessagesStars(snVar.a()) <= 0 && (sendButton2 = snVar.Y.getSendButton()) != null && snVar.Y.getEditField() != null && snVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (snVar.f41700u2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, snVar.getParentActivity(), snVar.f41654qa, false);
                        snVar.f41700u2 = r40Var;
                        r40Var.a();
                        snVar.f41700u2.setAlpha(0.0f);
                        snVar.f41700u2.setVisibility(4);
                        snVar.f41700u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        snVar.f41561j1.addView(snVar.f41700u2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    snVar.f41700u2.f(sendButton2, true);
                    snVar.f41712v2 = true;
                    return;
                }
                return;
        }
    }
}
