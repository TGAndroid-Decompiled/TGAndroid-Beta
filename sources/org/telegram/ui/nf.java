package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class nf implements Runnable {
    public final int f36501a;
    public final zn f36502b;

    public nf(zn znVar, int i10) {
        this.f36501a = i10;
        this.f36502b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        lk lkVar;
        View sendButton;
        View sendButton2;
        switch (this.f36501a) {
            case 0:
                this.f36502b.A7(true);
                return;
            case 1:
                this.f36502b.A7(true);
                return;
            case 2:
                zn znVar = this.f36502b;
                znVar.A7(false);
                eg.o1 o1Var = new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 24, true);
                o1Var.setDimBehind(false);
                o1Var.setOnHideListener(new fg(znVar, 1));
                o1Var.show();
                return;
            case 3:
                zn.P0(this.f36502b);
                return;
            case 4:
                zn.m0(this.f36502b);
                return;
            case 5:
                zn znVar2 = this.f36502b;
                if (znVar2.getUserConfig().isPremium()) {
                    znVar2.Jb = null;
                    znVar2.Qc(true);
                    org.telegram.ui.Components.qc.a0(znVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar2.getMessagesController().disableAds(true);
                    return;
                }
                znVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar2, 3, true));
                return;
            case 6:
                lk lkVar2 = this.f36502b.V;
                if (lkVar2 != null) {
                    lkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f36502b.H0);
                return;
            case 8:
                this.f36502b.V.H0();
                return;
            case 9:
                zn znVar3 = this.f36502b;
                znVar3.f40684na = null;
                znVar3.f40670ma = -1;
                View view = znVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                zn znVar4 = this.f36502b;
                ArrayList arrayList = znVar4.f40730r6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar4.f40619i6 = 0;
                znVar4.getMessagesController().markMentionsAsRead(znVar4.Q5, znVar4.d());
                znVar4.f40631j6 = true;
                znVar4.Kb(false);
                org.telegram.ui.ActionBar.p1 p1Var = znVar4.N8;
                if (p1Var != null) {
                    p1Var.dismiss();
                    return;
                }
                return;
            case 11:
                zn znVar5 = this.f36502b;
                ArrayList arrayList2 = znVar5.f40730r6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                znVar5.f40614i1 = 0;
                znVar5.Bc(true);
                znVar5.getMessagesController().markReactionsAsRead(znVar5.Q5, znVar5.d());
                org.telegram.ui.ActionBar.p1 p1Var2 = znVar5.N8;
                if (p1Var2 != null) {
                    p1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                zn znVar6 = this.f36502b;
                ArrayList arrayList3 = znVar6.f40730r6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                znVar6.f40626j1 = 0;
                znVar6.Ac(true);
                znVar6.getMessagesController().markPollVotesAsRead(znVar6.Q5, znVar6.d());
                org.telegram.ui.ActionBar.p1 p1Var3 = znVar6.N8;
                if (p1Var3 != null) {
                    p1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                zn.n1(this.f36502b);
                return;
            case 14:
                org.telegram.ui.Components.qc.a0(this.f36502b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f36502b.hc(false);
                return;
            case 16:
                zn znVar7 = this.f36502b;
                znVar7.D5 = null;
                znVar7.j8();
                return;
            case 17:
                zn znVar8 = this.f36502b;
                znVar8.D5 = null;
                znVar8.j8();
                return;
            case 18:
                this.f36502b.S6();
                return;
            case 19:
                this.f36502b.finishFragment();
                return;
            case 20:
                this.f36502b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f36502b.I0);
                return;
            case 22:
                zn znVar9 = this.f36502b;
                znVar9.z4 = null;
                znVar9.o9();
                znVar9.r9();
                return;
            case 23:
                zn znVar10 = this.f36502b;
                pk pkVar = znVar10.f40719q8;
                if (pkVar != null && pkVar.getParent() != null) {
                    znVar10.f40759u0.e1();
                    znVar10.f40745s8.setDrawingReady(false);
                    znVar10.f40719q8.setTag(null);
                    znVar10.U0.removeView(znVar10.f40719q8);
                    return;
                }
                return;
            case 24:
                zn znVar11 = this.f36502b;
                znVar11.f40658l9 = false;
                znVar11.e9(true);
                return;
            case 25:
                zn znVar12 = this.f36502b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = znVar12.P8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    znVar12.P8[0].performAccessibilityAction(64, null);
                    znVar12.P8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                zn znVar13 = this.f36502b;
                if (znVar13.getParentActivity() != null && znVar13.fragmentView != null && (lkVar = znVar13.V) != null && (sendButton = lkVar.getSendButton()) != null && znVar13.V.getEditField() != null && znVar13.V.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar13.f40552d2 == null) {
                        gj gjVar = new gj(4, 0, znVar13.getParentActivity(), znVar13.f40534ba, false);
                        znVar13.f40552d2 = gjVar;
                        gjVar.a();
                        znVar13.f40552d2.setAlpha(0.0f);
                        znVar13.f40552d2.setVisibility(4);
                        znVar13.f40552d2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar13.U0.addView(znVar13.f40552d2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar13.f40552d2.f(sendButton, true);
                    znVar13.f40565e2 = true;
                    return;
                }
                return;
            case 27:
                zn znVar14 = this.f36502b;
                if (znVar14.getParentActivity() != null && znVar14.fragmentView != null && znVar14.V != null && znVar14.Ba == null && znVar14.getMessagesController().getSendPaidMessagesStars(znVar14.a()) <= 0 && (sendButton2 = znVar14.V.getSendButton()) != null && znVar14.V.getEditField() != null && znVar14.V.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar14.f40578f2 == null) {
                        org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(4, znVar14.getParentActivity(), znVar14.f40534ba, false);
                        znVar14.f40578f2 = l40Var;
                        l40Var.a();
                        znVar14.f40578f2.setAlpha(0.0f);
                        znVar14.f40578f2.setVisibility(4);
                        znVar14.f40578f2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar14.U0.addView(znVar14.f40578f2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar14.f40578f2.f(sendButton2, true);
                    znVar14.f40590g2 = true;
                    return;
                }
                return;
            case 28:
                this.f36502b.g8(false, true, 0.0f);
                return;
            default:
                zn znVar15 = this.f36502b;
                znVar15.f40800x0.J.clear();
                lm lmVar = znVar15.f40800x0;
                lmVar.I = false;
                lmVar.O(true);
                znVar15.Pb(false);
                return;
        }
    }
}
