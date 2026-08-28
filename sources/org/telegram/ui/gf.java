package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class gf implements Runnable {
    public final int f38530a;
    public final qn f38531b;

    public gf(qn qnVar, int i9) {
        this.f38530a = i9;
        this.f38531b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        ak akVar;
        View sendButton;
        View sendButton2;
        switch (this.f38530a) {
            case 0:
                this.f38531b.A7(true);
                return;
            case 1:
                this.f38531b.A7(true);
                return;
            case 2:
                qn qnVar = this.f38531b;
                qnVar.A7(false);
                zf.x0 x0Var = new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new zf(qnVar, 1));
                x0Var.show();
                return;
            case 3:
                qn.P0(this.f38531b);
                return;
            case 4:
                qn.l0(this.f38531b);
                return;
            case 5:
                qn qnVar2 = this.f38531b;
                if (qnVar2.getUserConfig().isPremium()) {
                    qnVar2.Ib = null;
                    qnVar2.Qc(true);
                    org.telegram.ui.Components.oc.a0(qnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    qnVar2.getMessagesController().disableAds(true);
                    return;
                }
                qnVar2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar2, 3, true));
                return;
            case 6:
                ak akVar2 = this.f38531b.U;
                if (akVar2 != null) {
                    akVar2.p0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f38531b.G0);
                return;
            case 8:
                this.f38531b.U.G0();
                return;
            case 9:
                qn qnVar3 = this.f38531b;
                qnVar3.f41999ma = null;
                qnVar3.f41987la = -1;
                View view = qnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                qn qnVar4 = this.f38531b;
                ArrayList arrayList = qnVar4.f42042q6;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i9);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                qnVar4.f41935h6 = 0;
                qnVar4.getMessagesController().markMentionsAsRead(qnVar4.P5, qnVar4.b());
                qnVar4.f41948i6 = true;
                qnVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = qnVar4.M8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 11:
                qn qnVar5 = this.f38531b;
                ArrayList arrayList2 = qnVar5.f42042q6;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((MessageObject) arrayList2.get(i10)).markReactionsAsRead();
                }
                qnVar5.f41930h1 = 0;
                qnVar5.Bc(true);
                qnVar5.getMessagesController().markReactionsAsRead(qnVar5.P5, qnVar5.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = qnVar5.M8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                qn qnVar6 = this.f38531b;
                ArrayList arrayList3 = qnVar6.f42042q6;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((MessageObject) arrayList3.get(i11)).markPollVotesAsRead();
                }
                qnVar6.f41943i1 = 0;
                qnVar6.Ac(true);
                qnVar6.getMessagesController().markPollVotesAsRead(qnVar6.P5, qnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = qnVar6.M8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                qn.n1(this.f38531b);
                return;
            case 14:
                org.telegram.ui.Components.oc.a0(this.f38531b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f38531b.hc(false);
                return;
            case 16:
                qn qnVar7 = this.f38531b;
                qnVar7.C5 = null;
                qnVar7.j8();
                return;
            case 17:
                qn qnVar8 = this.f38531b;
                qnVar8.C5 = null;
                qnVar8.j8();
                return;
            case 18:
                this.f38531b.S6();
                return;
            case 19:
                this.f38531b.finishFragment();
                return;
            case 20:
                this.f38531b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f38531b.H0);
                return;
            case 22:
                qn qnVar9 = this.f38531b;
                qnVar9.f42145y4 = null;
                qnVar9.o9();
                qnVar9.r9();
                return;
            case 23:
                qn qnVar10 = this.f38531b;
                ek ekVar = qnVar10.f42032p8;
                if (ekVar != null && ekVar.getParent() != null) {
                    qnVar10.f42077t0.f1();
                    qnVar10.f42058r8.setDrawingReady(false);
                    qnVar10.f42032p8.setTag(null);
                    qnVar10.T0.removeView(qnVar10.f42032p8);
                    return;
                }
                return;
            case 24:
                qn qnVar11 = this.f38531b;
                qnVar11.f41975k9 = false;
                qnVar11.e9(true);
                return;
            case 25:
                qn qnVar12 = this.f38531b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = qnVar12.O8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    qnVar12.O8[0].performAccessibilityAction(64, null);
                    qnVar12.O8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                qn qnVar13 = this.f38531b;
                if (qnVar13.getParentActivity() != null && qnVar13.fragmentView != null && (akVar = qnVar13.U) != null && (sendButton = akVar.getSendButton()) != null && qnVar13.U.getEditField() != null && qnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (qnVar13.f41867c2 == null) {
                        wi wiVar = new wi(4, 0, qnVar13.getParentActivity(), qnVar13.f41848aa, false);
                        qnVar13.f41867c2 = wiVar;
                        wiVar.a();
                        qnVar13.f41867c2.setAlpha(0.0f);
                        qnVar13.f41867c2.setVisibility(4);
                        qnVar13.f41867c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        qnVar13.T0.addView(qnVar13.f41867c2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar13.f41867c2.f(sendButton, true);
                    qnVar13.f41880d2 = true;
                    return;
                }
                return;
            case 27:
                qn qnVar14 = this.f38531b;
                if (qnVar14.getParentActivity() != null && qnVar14.fragmentView != null && qnVar14.U != null && qnVar14.Aa == null && qnVar14.getMessagesController().getSendPaidMessagesStars(qnVar14.a()) <= 0 && (sendButton2 = qnVar14.U.getSendButton()) != null && qnVar14.U.getEditField() != null && qnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (qnVar14.f41893e2 == null) {
                        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(4, qnVar14.getParentActivity(), qnVar14.f41848aa, false);
                        qnVar14.f41893e2 = s30Var;
                        s30Var.a();
                        qnVar14.f41893e2.setAlpha(0.0f);
                        qnVar14.f41893e2.setVisibility(4);
                        qnVar14.f41893e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        qnVar14.T0.addView(qnVar14.f41893e2, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    qnVar14.f41893e2.f(sendButton2, true);
                    qnVar14.f41906f2 = true;
                    return;
                }
                return;
            case 28:
                this.f38531b.g8(false, true, 0.0f);
                return;
            default:
                qn qnVar15 = this.f38531b;
                qnVar15.f42114w0.I.clear();
                bm bmVar = qnVar15.f42114w0;
                bmVar.H = false;
                bmVar.O(true);
                qnVar15.Pb(false);
                return;
        }
    }
}
