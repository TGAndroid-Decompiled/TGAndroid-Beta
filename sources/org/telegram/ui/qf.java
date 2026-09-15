package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class qf implements Runnable {
    public final int f36868a;
    public final bo f36869b;

    public qf(bo boVar, int i10) {
        this.f36868a = i10;
        this.f36869b = boVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        mk mkVar;
        View sendButton;
        View sendButton2;
        switch (this.f36868a) {
            case 0:
                this.f36869b.A7(true);
                return;
            case 1:
                this.f36869b.A7(true);
                return;
            case 2:
                bo boVar = this.f36869b;
                boVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new jg(boVar, 1));
                x0Var.show();
                return;
            case 3:
                bo.P0(this.f36869b);
                return;
            case 4:
                bo.m0(this.f36869b);
                return;
            case 5:
                bo boVar2 = this.f36869b;
                if (boVar2.getUserConfig().isPremium()) {
                    boVar2.Mb = null;
                    boVar2.Qc(true);
                    org.telegram.ui.Components.vc.a0(boVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    boVar2.getMessagesController().disableAds(true);
                    return;
                }
                boVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar2, 3, true));
                return;
            case 6:
                mk mkVar2 = this.f36869b.Y;
                if (mkVar2 != null) {
                    mkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f36869b.K0);
                return;
            case 8:
                this.f36869b.Y.H0();
                return;
            case 9:
                bo boVar3 = this.f36869b;
                boVar3.f32442qa = null;
                boVar3.f32430pa = -1;
                View view = boVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                bo boVar4 = this.f36869b;
                ArrayList arrayList = boVar4.f32491u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                boVar4.f32378l6 = 0;
                boVar4.getMessagesController().markMentionsAsRead(boVar4.T5, boVar4.d());
                boVar4.f32390m6 = true;
                boVar4.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = boVar4.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    return;
                }
                return;
            case 11:
                bo boVar5 = this.f36869b;
                ArrayList arrayList2 = boVar5.f32491u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                boVar5.l1 = 0;
                boVar5.Bc(true);
                boVar5.getMessagesController().markReactionsAsRead(boVar5.T5, boVar5.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = boVar5.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                bo boVar6 = this.f36869b;
                ArrayList arrayList3 = boVar6.f32491u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                boVar6.f32385m1 = 0;
                boVar6.Ac(true);
                boVar6.getMessagesController().markPollVotesAsRead(boVar6.T5, boVar6.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = boVar6.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                bo.n1(this.f36869b);
                return;
            case 14:
                org.telegram.ui.Components.vc.a0(this.f36869b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f36869b.hc(false);
                return;
            case 16:
                bo boVar7 = this.f36869b;
                boVar7.G5 = null;
                boVar7.j8();
                return;
            case 17:
                bo boVar8 = this.f36869b;
                boVar8.G5 = null;
                boVar8.j8();
                return;
            case 18:
                this.f36869b.S6();
                return;
            case 19:
                this.f36869b.finishFragment();
                return;
            case 20:
                this.f36869b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f36869b.L0);
                return;
            case 22:
                bo boVar9 = this.f36869b;
                boVar9.C4 = null;
                boVar9.o9();
                boVar9.r9();
                return;
            case 23:
                bo boVar10 = this.f36869b;
                qk qkVar = boVar10.f32481t8;
                if (qkVar != null && qkVar.getParent() != null) {
                    boVar10.f32524x0.f1();
                    boVar10.f32506v8.setDrawingReady(false);
                    boVar10.f32481t8.setTag(null);
                    boVar10.X0.removeView(boVar10.f32481t8);
                    return;
                }
                return;
            case 24:
                bo boVar11 = this.f36869b;
                boVar11.o9 = false;
                boVar11.e9(true);
                return;
            case 25:
                bo boVar12 = this.f36869b;
                org.telegram.ui.ActionBar.f1[] f1VarArr = boVar12.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    boVar12.S8[0].performAccessibilityAction(64, null);
                    boVar12.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                bo boVar13 = this.f36869b;
                if (boVar13.getParentActivity() != null && boVar13.fragmentView != null && (mkVar = boVar13.Y) != null && (sendButton = mkVar.getSendButton()) != null && boVar13.Y.getEditField() != null && boVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (boVar13.f32314g2 == null) {
                        ij ijVar = new ij(4, 0, boVar13.getParentActivity(), boVar13.f32297ea, false);
                        boVar13.f32314g2 = ijVar;
                        ijVar.a();
                        boVar13.f32314g2.setAlpha(0.0f);
                        boVar13.f32314g2.setVisibility(4);
                        boVar13.f32314g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        boVar13.X0.addView(boVar13.f32314g2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar13.f32314g2.f(sendButton, true);
                    boVar13.f32326h2 = true;
                    return;
                }
                return;
            case 27:
                bo boVar14 = this.f36869b;
                if (boVar14.getParentActivity() != null && boVar14.fragmentView != null && boVar14.Y != null && boVar14.Ea == null && boVar14.getMessagesController().getSendPaidMessagesStars(boVar14.a()) <= 0 && (sendButton2 = boVar14.Y.getSendButton()) != null && boVar14.Y.getEditField() != null && boVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (boVar14.f32338i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, boVar14.getParentActivity(), boVar14.f32297ea, false);
                        boVar14.f32338i2 = i40Var;
                        i40Var.a();
                        boVar14.f32338i2.setAlpha(0.0f);
                        boVar14.f32338i2.setVisibility(4);
                        boVar14.f32338i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        boVar14.X0.addView(boVar14.f32338i2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar14.f32338i2.f(sendButton2, true);
                    boVar14.f32351j2 = true;
                    return;
                }
                return;
            case 28:
                this.f36869b.g8(false, true, 0.0f);
                return;
            default:
                bo boVar15 = this.f36869b;
                boVar15.A0.M.clear();
                nm nmVar = boVar15.A0;
                nmVar.L = false;
                nmVar.O(true);
                boVar15.Pb(false);
                return;
        }
    }
}
