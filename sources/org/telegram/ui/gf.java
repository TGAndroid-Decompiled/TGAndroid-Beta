package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class gf implements Runnable {

    public final int f38399a;

    public final rn f38400b;

    public gf(rn rnVar, int i10) {
        this.f38399a = i10;
        this.f38400b = rnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        ck ckVar;
        View sendButton;
        View sendButton2;
        switch (this.f38399a) {
            case 0:
                this.f38400b.A7(true);
                break;
            case 1:
                this.f38400b.A7(true);
                break;
            case 2:
                rn rnVar = this.f38400b;
                rnVar.A7(false);
                ag.g2 g2Var = new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 24, true);
                g2Var.setDimBehind(false);
                g2Var.setOnHideListener(new ag(rnVar, 1));
                g2Var.show();
                break;
            case 3:
                rn.P0(this.f38400b);
                break;
            case 4:
                rn.m0(this.f38400b);
                break;
            case 5:
                rn rnVar2 = this.f38400b;
                if (rnVar2.getUserConfig().isPremium()) {
                    rnVar2.Ib = null;
                    rnVar2.Qc(true);
                    org.telegram.ui.Components.mc.a0(rnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    rnVar2.getMessagesController().disableAds(true);
                } else {
                    rnVar2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar2, 3, true));
                }
                break;
            case 6:
                ck ckVar2 = this.f38400b.U;
                if (ckVar2 != null) {
                    ckVar2.q0(true);
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.f38400b.G0);
                break;
            case 8:
                this.f38400b.U.H0();
                break;
            case 9:
                rn rnVar3 = this.f38400b;
                rnVar3.f42135ma = null;
                rnVar3.la = -1;
                View view = rnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
                break;
            case 10:
                rn rnVar4 = this.f38400b;
                ArrayList arrayList = rnVar4.q6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                rnVar4.f42070h6 = 0;
                rnVar4.getMessagesController().markMentionsAsRead(rnVar4.P5, rnVar4.b());
                rnVar4.f42083i6 = true;
                rnVar4.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = rnVar4.M8;
                if (n1Var != null) {
                    n1Var.dismiss();
                }
                break;
            case 11:
                rn rnVar5 = this.f38400b;
                ArrayList arrayList2 = rnVar5.q6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                rnVar5.f42065h1 = 0;
                rnVar5.Bc(true);
                rnVar5.getMessagesController().markReactionsAsRead(rnVar5.P5, rnVar5.b());
                org.telegram.ui.ActionBar.n1 n1Var2 = rnVar5.M8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                }
                break;
            case 12:
                rn rnVar6 = this.f38400b;
                ArrayList arrayList3 = rnVar6.q6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                rnVar6.f42078i1 = 0;
                rnVar6.Ac(true);
                rnVar6.getMessagesController().markPollVotesAsRead(rnVar6.P5, rnVar6.b());
                org.telegram.ui.ActionBar.n1 n1Var3 = rnVar6.M8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                }
                break;
            case 13:
                rn.n1(this.f38400b);
                break;
            case 14:
                org.telegram.ui.Components.mc.a0(this.f38400b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.f38400b.hc(false);
                break;
            case 16:
                rn rnVar7 = this.f38400b;
                rnVar7.C5 = null;
                rnVar7.j8();
                break;
            case 17:
                rn rnVar8 = this.f38400b;
                rnVar8.C5 = null;
                rnVar8.j8();
                break;
            case 18:
                this.f38400b.S6();
                break;
            case 19:
                this.f38400b.finishFragment();
                break;
            case 20:
                this.f38400b.g8(false, true, 0.0f);
                break;
            case 21:
                AndroidUtilities.removeFromParent(this.f38400b.H0);
                break;
            case 22:
                rn rnVar9 = this.f38400b;
                rnVar9.f42281y4 = null;
                rnVar9.o9();
                rnVar9.r9();
                break;
            case 23:
                rn rnVar10 = this.f38400b;
                gk gkVar = rnVar10.f42171p8;
                if (gkVar != null && gkVar.getParent() != null) {
                    rnVar10.f42213t0.f1();
                    rnVar10.f42194r8.setDrawingReady(false);
                    rnVar10.f42171p8.setTag(null);
                    rnVar10.T0.removeView(rnVar10.f42171p8);
                    break;
                }
                break;
            case 24:
                rn rnVar11 = this.f38400b;
                rnVar11.f42112k9 = false;
                rnVar11.e9(true);
                break;
            case 25:
                rn rnVar12 = this.f38400b;
                org.telegram.ui.ActionBar.f1[] f1VarArr = rnVar12.O8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    rnVar12.O8[0].performAccessibilityAction(64, null);
                    rnVar12.O8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                rn rnVar13 = this.f38400b;
                if (rnVar13.getParentActivity() != null && rnVar13.fragmentView != null && (ckVar = rnVar13.U) != null && (sendButton = ckVar.getSendButton()) != null && rnVar13.U.getEditField() != null && rnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (rnVar13.f42003c2 == null) {
                        yi yiVar = new yi(4, 0, rnVar13.getParentActivity(), rnVar13.f41983aa, false);
                        rnVar13.f42003c2 = yiVar;
                        yiVar.a();
                        rnVar13.f42003c2.setAlpha(0.0f);
                        rnVar13.f42003c2.setVisibility(4);
                        rnVar13.f42003c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        rnVar13.T0.addView(rnVar13.f42003c2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    rnVar13.f42003c2.f(sendButton, true);
                    rnVar13.f42015d2 = true;
                    break;
                }
                break;
            case 27:
                rn rnVar14 = this.f38400b;
                if (rnVar14.getParentActivity() != null && rnVar14.fragmentView != null && rnVar14.U != null && rnVar14.Aa == null && rnVar14.getMessagesController().getSendPaidMessagesStars(rnVar14.a()) <= 0 && (sendButton2 = rnVar14.U.getSendButton()) != null && rnVar14.U.getEditField() != null && rnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (rnVar14.f42029e2 == null) {
                        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(4, rnVar14.getParentActivity(), rnVar14.f41983aa, false);
                        rnVar14.f42029e2 = x30Var;
                        x30Var.a();
                        rnVar14.f42029e2.setAlpha(0.0f);
                        rnVar14.f42029e2.setVisibility(4);
                        rnVar14.f42029e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        rnVar14.T0.addView(rnVar14.f42029e2, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    rnVar14.f42029e2.f(sendButton2, true);
                    rnVar14.f42042f2 = true;
                    break;
                }
                break;
            case 28:
                this.f38400b.g8(false, true, 0.0f);
                break;
            default:
                rn rnVar15 = this.f38400b;
                rnVar15.f42252w0.I.clear();
                dm dmVar = rnVar15.f42252w0;
                dmVar.H = false;
                dmVar.O(true);
                rnVar15.Pb(false);
                break;
        }
    }
}
