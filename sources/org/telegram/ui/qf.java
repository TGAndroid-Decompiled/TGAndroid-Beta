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
public final class qf implements Runnable {
    public final int f41166a;
    public final zn f41167b;

    public qf(zn znVar, int i10) {
        this.f41166a = i10;
        this.f41167b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        ok okVar;
        View sendButton;
        View sendButton2;
        int i10 = this.f41166a;
        zn znVar = this.f41167b;
        switch (i10) {
            case 0:
                znVar.D7(true);
                return;
            case 1:
                znVar.D7(true);
                return;
            case 2:
                znVar.D7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.m2) znVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new pe(znVar, 2));
                y0Var.show();
                return;
            case 3:
                zn.U(znVar);
                return;
            case 4:
                zn.f0(znVar);
                return;
            case 5:
                if (znVar.getUserConfig().isPremium()) {
                    znVar.Mb = null;
                    znVar.Uc(true);
                    org.telegram.ui.Components.ad.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar.getMessagesController().disableAds(true);
                    return;
                }
                znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar, 3, true));
                return;
            case 6:
                ok okVar2 = znVar.Y;
                if (okVar2 != null) {
                    okVar2.o0(true);
                    return;
                }
                return;
            case 7:
                znVar.f44906qa = null;
                znVar.f44894pa = -1;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                ArrayList arrayList = znVar.f44955u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar.f44842l6 = 0;
                znVar.getMessagesController().markMentionsAsRead(znVar.T5, znVar.d());
                znVar.f44854m6 = true;
                znVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = znVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = znVar.f44955u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                znVar.l1 = 0;
                znVar.Fc(true);
                znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = znVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList3 = znVar.f44955u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                znVar.f44849m1 = 0;
                znVar.Ec(true);
                znVar.getMessagesController().markPollVotesAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = znVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 11:
                znVar.Y.F0();
                return;
            case 12:
                zn.g0(znVar);
                return;
            case 13:
                znVar.j8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                znVar.j8(false, true, 0.0f);
                return;
            case 16:
                znVar.G5 = null;
                znVar.m8();
                return;
            case 17:
                znVar.G5 = null;
                znVar.m8();
                return;
            case 18:
                znVar.finishFragment();
                return;
            case 19:
                znVar.j8(false, true, 0.0f);
                return;
            case 20:
                znVar.C4 = null;
                znVar.t9();
                znVar.w9();
                return;
            case 21:
                znVar.V6();
                return;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = znVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    znVar.S8[0].performAccessibilityAction(64, null);
                    znVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(znVar.getParentActivity(), 3, znVar.f44762ea);
                znVar.f44895pb = a2Var;
                a2Var.setOnShowListener(new of(znVar, 1));
                znVar.f44895pb.setOnCancelListener(znVar.f44858ma);
                znVar.f44895pb.q(500L);
                return;
            case 24:
                rk rkVar = znVar.f44945t8;
                if (rkVar != null && rkVar.getParent() != null) {
                    znVar.f44989x0.f1();
                    znVar.f44970v8.setDrawingReady(false);
                    znVar.f44945t8.setTag(null);
                    znVar.X0.removeView(znVar.f44945t8);
                    return;
                }
                return;
            case 25:
                znVar.o9 = false;
                znVar.j9(true);
                return;
            case 26:
                znVar.f44903q7 = null;
                org.telegram.ui.Components.z60 z60Var = znVar.f44716b3;
                if (z60Var != null) {
                    org.telegram.ui.Components.w60 cameraContainer = z60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(znVar.f44716b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(znVar.f44716b3.getPaint(), org.telegram.ui.Components.u6.f31252b, 0), ObjectAnimator.ofFloat(znVar.f44716b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new xi(znVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 27:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && (okVar = znVar.Y) != null && (sendButton = okVar.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar.f44779g2 == null) {
                        jj jjVar = new jj(4, 0, znVar.getParentActivity(), znVar.f44762ea, false);
                        znVar.f44779g2 = jjVar;
                        jjVar.a();
                        znVar.f44779g2.setAlpha(0.0f);
                        znVar.f44779g2.setVisibility(4);
                        znVar.f44779g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar.X0.addView(znVar.f44779g2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.f44779g2.f(sendButton, true);
                    znVar.f44790h2 = true;
                    return;
                }
                return;
            case 28:
                znVar.A0.M.clear();
                mm mmVar = znVar.A0;
                mmVar.L = false;
                mmVar.O(true);
                znVar.Tb(false);
                return;
            default:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && znVar.Y != null && znVar.Fa == null && znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) <= 0 && (sendButton2 = znVar.Y.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar.f44802i2 == null) {
                        org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(4, znVar.getParentActivity(), znVar.f44762ea, false);
                        znVar.f44802i2 = a50Var;
                        a50Var.a();
                        znVar.f44802i2.setAlpha(0.0f);
                        znVar.f44802i2.setVisibility(4);
                        znVar.f44802i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar.X0.addView(znVar.f44802i2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.f44802i2.f(sendButton2, true);
                    znVar.f44815j2 = true;
                    return;
                }
                return;
        }
    }
}
