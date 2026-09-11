package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class qf implements Runnable {
    public final int f39858a;
    public final co f39859b;

    public qf(co coVar, int i10) {
        this.f39858a = i10;
        this.f39859b = coVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        mk mkVar;
        View sendButton;
        View sendButton2;
        switch (this.f39858a) {
            case 0:
                this.f39859b.A7(true);
                return;
            case 1:
                this.f39859b.A7(true);
                return;
            case 2:
                co coVar = this.f39859b;
                coVar.A7(false);
                sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 24, true);
                a1Var.setDimBehind(false);
                a1Var.setOnHideListener(new jg(coVar, 1));
                a1Var.show();
                return;
            case 3:
                co.P0(this.f39859b);
                return;
            case 4:
                co.m0(this.f39859b);
                return;
            case 5:
                co coVar2 = this.f39859b;
                if (coVar2.getUserConfig().isPremium()) {
                    coVar2.Mb = null;
                    coVar2.Qc(true);
                    org.telegram.ui.Components.yc.a0(coVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    coVar2.getMessagesController().disableAds(true);
                    return;
                }
                coVar2.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar2, 3, true));
                return;
            case 6:
                mk mkVar2 = this.f39859b.Y;
                if (mkVar2 != null) {
                    mkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f39859b.K0);
                return;
            case 8:
                this.f39859b.Y.H0();
                return;
            case 9:
                co coVar3 = this.f39859b;
                coVar3.f35391qa = null;
                coVar3.f35379pa = -1;
                View view = coVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                co coVar4 = this.f39859b;
                ArrayList arrayList = coVar4.f35440u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                coVar4.f35327l6 = 0;
                coVar4.getMessagesController().markMentionsAsRead(coVar4.T5, coVar4.d());
                coVar4.f35339m6 = true;
                coVar4.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = coVar4.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    return;
                }
                return;
            case 11:
                co coVar5 = this.f39859b;
                ArrayList arrayList2 = coVar5.f35440u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                coVar5.l1 = 0;
                coVar5.Bc(true);
                coVar5.getMessagesController().markReactionsAsRead(coVar5.T5, coVar5.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = coVar5.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                co coVar6 = this.f39859b;
                ArrayList arrayList3 = coVar6.f35440u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                coVar6.f35334m1 = 0;
                coVar6.Ac(true);
                coVar6.getMessagesController().markPollVotesAsRead(coVar6.T5, coVar6.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = coVar6.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                co.n1(this.f39859b);
                return;
            case 14:
                org.telegram.ui.Components.yc.a0(this.f39859b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f39859b.hc(false);
                return;
            case 16:
                co coVar7 = this.f39859b;
                coVar7.G5 = null;
                coVar7.j8();
                return;
            case 17:
                co coVar8 = this.f39859b;
                coVar8.G5 = null;
                coVar8.j8();
                return;
            case 18:
                this.f39859b.S6();
                return;
            case 19:
                this.f39859b.finishFragment();
                return;
            case 20:
                this.f39859b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f39859b.L0);
                return;
            case 22:
                co coVar9 = this.f39859b;
                coVar9.C4 = null;
                coVar9.o9();
                coVar9.r9();
                return;
            case 23:
                co coVar10 = this.f39859b;
                qk qkVar = coVar10.f35430t8;
                if (qkVar != null && qkVar.getParent() != null) {
                    coVar10.f35473x0.e1();
                    coVar10.f35455v8.setDrawingReady(false);
                    coVar10.f35430t8.setTag(null);
                    coVar10.X0.removeView(coVar10.f35430t8);
                    return;
                }
                return;
            case 24:
                co coVar11 = this.f39859b;
                coVar11.o9 = false;
                coVar11.e9(true);
                return;
            case 25:
                co coVar12 = this.f39859b;
                org.telegram.ui.ActionBar.f1[] f1VarArr = coVar12.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    coVar12.S8[0].performAccessibilityAction(64, null);
                    coVar12.S8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                co coVar13 = this.f39859b;
                if (coVar13.getParentActivity() != null && coVar13.fragmentView != null && (mkVar = coVar13.Y) != null && (sendButton = mkVar.getSendButton()) != null && coVar13.Y.getEditField() != null && coVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (coVar13.f35264g2 == null) {
                        ij ijVar = new ij(4, 0, coVar13.getParentActivity(), coVar13.f35247ea, false);
                        coVar13.f35264g2 = ijVar;
                        ijVar.a();
                        coVar13.f35264g2.setAlpha(0.0f);
                        coVar13.f35264g2.setVisibility(4);
                        coVar13.f35264g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        coVar13.X0.addView(coVar13.f35264g2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    coVar13.f35264g2.f(sendButton, true);
                    coVar13.f35275h2 = true;
                    return;
                }
                return;
            case 27:
                co coVar14 = this.f39859b;
                if (coVar14.getParentActivity() != null && coVar14.fragmentView != null && coVar14.Y != null && coVar14.Ea == null && coVar14.getMessagesController().getSendPaidMessagesStars(coVar14.a()) <= 0 && (sendButton2 = coVar14.Y.getSendButton()) != null && coVar14.Y.getEditField() != null && coVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (coVar14.f35287i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, coVar14.getParentActivity(), coVar14.f35247ea, false);
                        coVar14.f35287i2 = i40Var;
                        i40Var.a();
                        coVar14.f35287i2.setAlpha(0.0f);
                        coVar14.f35287i2.setVisibility(4);
                        coVar14.f35287i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        coVar14.X0.addView(coVar14.f35287i2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    coVar14.f35287i2.f(sendButton2, true);
                    coVar14.f35300j2 = true;
                    return;
                }
                return;
            case 28:
                this.f39859b.g8(false, true, 0.0f);
                return;
            default:
                co coVar15 = this.f39859b;
                coVar15.A0.M.clear();
                om omVar = coVar15.A0;
                omVar.L = false;
                omVar.O(true);
                coVar15.Pb(false);
                return;
        }
    }
}
