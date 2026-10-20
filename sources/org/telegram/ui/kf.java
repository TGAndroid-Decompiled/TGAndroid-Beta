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
    public final int f38592a;
    public final qn f38593b;

    public kf(qn qnVar, int i10) {
        this.f38592a = i10;
        this.f38593b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        fk fkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f38592a;
        qn qnVar = this.f38593b;
        switch (i10) {
            case 0:
                qnVar.D7(true);
                return;
            case 1:
                qnVar.D7(true);
                return;
            case 2:
                qnVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new oe(qnVar, 2));
                y0Var.show();
                return;
            case 3:
                qn.U(qnVar);
                return;
            case 4:
                qn.f0(qnVar);
                return;
            case 5:
                if (qnVar.getUserConfig().isPremium()) {
                    qnVar.Mb = null;
                    qnVar.Vc(true);
                    org.telegram.ui.Components.xc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    qnVar.getMessagesController().disableAds(true);
                    return;
                }
                qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 3, true));
                return;
            case 6:
                fk fkVar2 = qnVar.Y;
                if (fkVar2 != null) {
                    fkVar2.o0(true);
                    return;
                }
                return;
            case 7:
                qnVar.f40818qa = null;
                qnVar.f40806pa = -1;
                View view = qnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = qnVar.f40868u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                qnVar.f40754l6 = 0;
                qnVar.getMessagesController().markMentionsAsRead(qnVar.T5, qnVar.d());
                qnVar.f40766m6 = true;
                qnVar.Pb(false);
                org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = qnVar.f40868u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                qnVar.l1 = 0;
                qnVar.Gc(true);
                qnVar.getMessagesController().markReactionsAsRead(qnVar.T5, qnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = qnVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = qnVar.f40868u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                qnVar.f40761m1 = 0;
                qnVar.Fc(true);
                qnVar.getMessagesController().markPollVotesAsRead(qnVar.T5, qnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = qnVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                qnVar.Y.F0();
                return;
            case 12:
                qn.g0(qnVar);
                return;
            case 13:
                qnVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                qnVar.j8(false, true, 0.0f);
                return;
            case 16:
                qnVar.G5 = null;
                qnVar.m8();
                return;
            case 17:
                qnVar.G5 = null;
                qnVar.m8();
                return;
            case 18:
                qnVar.finishFragment();
                return;
            case 19:
                qnVar.j8(false, true, 0.0f);
                return;
            case 20:
                qnVar.C4 = null;
                qnVar.t9();
                qnVar.w9();
                return;
            case 21:
                qnVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = qnVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    qnVar.S8[0].performAccessibilityAction(64, null);
                    qnVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, qnVar.f40673ea);
                qnVar.f40807pb = b2Var;
                b2Var.setOnShowListener(new hf(qnVar, 1));
                qnVar.f40807pb.setOnCancelListener(qnVar.f40770ma);
                qnVar.f40807pb.r(500L);
                return;
            case 24:
                ik ikVar = qnVar.f40857t8;
                if (ikVar != null && ikVar.getParent() != null) {
                    qnVar.f40901x0.f1();
                    qnVar.f40882v8.setDrawingReady(false);
                    qnVar.f40857t8.setTag(null);
                    qnVar.X0.removeView(qnVar.f40857t8);
                    return;
                }
                return;
            case 25:
                qnVar.f40796o9 = false;
                qnVar.j9(true);
                return;
            case 26:
                qnVar.f40815q7 = null;
                org.telegram.ui.Components.r60 r60Var = qnVar.f40628b3;
                if (r60Var != null) {
                    org.telegram.ui.Components.o60 cameraContainer = r60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(qnVar.f40628b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(qnVar.f40628b3.getPaint(), org.telegram.ui.Components.t6.f30444b, 0), ObjectAnimator.ofFloat(qnVar.f40628b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new oi(qnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && (fkVar = qnVar.Y) != null && (sendButton = fkVar.getSendButton()) != null && qnVar.Y.getEditField() != null && qnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (qnVar.f40690g2 == null) {
                        aj ajVar = new aj(4, 0, qnVar.getParentActivity(), qnVar.f40673ea, false);
                        qnVar.f40690g2 = ajVar;
                        ajVar.a();
                        qnVar.f40690g2.setAlpha(0.0f);
                        qnVar.f40690g2.setVisibility(4);
                        qnVar.f40690g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        qnVar.X0.addView(qnVar.f40690g2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar.f40690g2.f(sendButton, true);
                    qnVar.f40703h2 = true;
                    return;
                }
                return;
            case 28:
                qnVar.A0.M.clear();
                dm dmVar = qnVar.A0;
                dmVar.L = false;
                dmVar.O(true);
                qnVar.Ub(false);
                return;
            default:
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && qnVar.Y != null && qnVar.Fa == null && qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a()) <= 0 && (sendButton2 = qnVar.Y.getSendButton()) != null && qnVar.Y.getEditField() != null && qnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (qnVar.f40714i2 == null) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(4, qnVar.getParentActivity(), qnVar.f40673ea, false);
                        qnVar.f40714i2 = r40Var;
                        r40Var.a();
                        qnVar.f40714i2.setAlpha(0.0f);
                        qnVar.f40714i2.setVisibility(4);
                        qnVar.f40714i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        qnVar.X0.addView(qnVar.f40714i2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar.f40714i2.f(sendButton2, true);
                    qnVar.f40726j2 = true;
                    return;
                }
                return;
        }
    }
}
