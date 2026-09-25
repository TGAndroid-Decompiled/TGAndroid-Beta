package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class of implements Runnable {
    public final int f36227a;
    public final wn f36228b;

    public of(wn wnVar, int i10) {
        this.f36227a = i10;
        this.f36228b = wnVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        View sendButton;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i10 = this.f36227a;
        wn wnVar = this.f36228b;
        switch (i10) {
            case 0:
                wnVar.A7(true);
                return;
            case 1:
                wnVar.A7(true);
                return;
            case 2:
                wnVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new gg(wnVar, 1));
                x0Var.show();
                return;
            case 3:
                wn.L0(wnVar);
                return;
            case 4:
                wn.T0(wnVar);
                return;
            case 5:
                if (wnVar.getUserConfig().isPremium()) {
                    wnVar.Lb = null;
                    wnVar.Qc(true);
                    org.telegram.ui.Components.xc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    wnVar.getMessagesController().disableAds(true);
                    return;
                }
                wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
                return;
            case 6:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                wnVar.Y.H0();
                return;
            case 8:
                wnVar.f39614qa = null;
                wnVar.f39602pa = -1;
                View view = wnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = wnVar.f39663u6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                wnVar.f39550l6 = 0;
                wnVar.getMessagesController().markMentionsAsRead(wnVar.T5, wnVar.d());
                wnVar.f39562m6 = true;
                wnVar.Kb(false);
                org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList2 = wnVar.f39663u6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((MessageObject) arrayList2.get(i12)).markReactionsAsRead();
                }
                wnVar.l1 = 0;
                wnVar.Bc(true);
                wnVar.getMessagesController().markReactionsAsRead(wnVar.T5, wnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = wnVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList3 = wnVar.f39663u6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((MessageObject) arrayList3.get(i13)).markPollVotesAsRead();
                }
                wnVar.f39557m1 = 0;
                wnVar.Ac(true);
                wnVar.getMessagesController().markPollVotesAsRead(wnVar.T5, wnVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = wnVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    return;
                }
                return;
            case 12:
                wn.q0(wnVar);
                return;
            case 13:
                org.telegram.ui.Components.xc.a0(wnVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 14:
                wnVar.g8(false, true, 0.0f);
                return;
            case 15:
                wnVar.hc(false);
                return;
            case 16:
                AndroidUtilities.removeFromParent(wnVar.L0);
                return;
            case 17:
                wnVar.C4 = null;
                wnVar.o9();
                wnVar.r9();
                return;
            case 18:
                wnVar.S6();
                return;
            case 19:
                wnVar.finishFragment();
                return;
            case 20:
                wnVar.o9 = false;
                wnVar.e9(true);
                return;
            case 21:
                nk nkVar = wnVar.f39653t8;
                if (nkVar != null && nkVar.getParent() != null) {
                    wnVar.f39696x0.f1();
                    wnVar.f39678v8.setDrawingReady(false);
                    wnVar.f39653t8.setTag(null);
                    wnVar.X0.removeView(wnVar.f39653t8);
                    return;
                }
                return;
            case 22:
                wnVar.f39611q7 = null;
                org.telegram.ui.Components.h60 h60Var = wnVar.f39425b3;
                if (h60Var != null) {
                    org.telegram.ui.Components.e60 cameraContainer = h60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(wnVar.f39425b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(wnVar.f39425b3.getPaint(), org.telegram.ui.Components.s6.f28162b, 0), ObjectAnimator.ofFloat(wnVar.f39425b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ui(wnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 23:
                wnVar.G5 = null;
                wnVar.j8();
                return;
            case 24:
                wnVar.G5 = null;
                wnVar.j8();
                return;
            case 25:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && (jkVar = wnVar.Y) != null && (sendButton = jkVar.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (wnVar.f39487g2 == null) {
                        fj fjVar = new fj(4, 0, wnVar.getParentActivity(), wnVar.f39470ea, false);
                        wnVar.f39487g2 = fjVar;
                        fjVar.a();
                        wnVar.f39487g2.setAlpha(0.0f);
                        wnVar.f39487g2.setVisibility(4);
                        wnVar.f39487g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        wnVar.X0.addView(wnVar.f39487g2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.f39487g2.f(sendButton, true);
                    wnVar.f39498h2 = true;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.e1[] e1VarArr = wnVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    wnVar.S8[0].performAccessibilityAction(64, null);
                    wnVar.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 27:
                wnVar.g8(false, true, 0.0f);
                return;
            case 28:
                wnVar.A0.M.clear();
                jm jmVar = wnVar.A0;
                jmVar.L = false;
                jmVar.O(true);
                wnVar.Pb(false);
                return;
            default:
                AndroidUtilities.removeFromParent(wnVar.J0);
                return;
        }
    }
}
