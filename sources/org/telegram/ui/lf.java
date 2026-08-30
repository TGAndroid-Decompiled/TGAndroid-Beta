package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class lf implements Runnable {
    public final int f36072a;
    public final xn f36073b;

    public lf(xn xnVar, int i10) {
        this.f36072a = i10;
        this.f36073b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        jk jkVar;
        View sendButton;
        View sendButton2;
        switch (this.f36072a) {
            case 0:
                this.f36073b.A7(true);
                return;
            case 1:
                this.f36073b.A7(true);
                return;
            case 2:
                xn xnVar = this.f36073b;
                xnVar.A7(false);
                eg.o1 o1Var = new eg.o1((org.telegram.ui.ActionBar.p2) xnVar, 24, true);
                o1Var.setDimBehind(false);
                o1Var.setOnHideListener(new dg(xnVar, 1));
                o1Var.show();
                return;
            case 3:
                xn.P0(this.f36073b);
                return;
            case 4:
                xn.m0(this.f36073b);
                return;
            case 5:
                xn xnVar2 = this.f36073b;
                if (xnVar2.getUserConfig().isPremium()) {
                    xnVar2.Jb = null;
                    xnVar2.Qc(true);
                    org.telegram.ui.Components.qc.a0(xnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    xnVar2.getMessagesController().disableAds(true);
                    return;
                }
                xnVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar2, 3, true));
                return;
            case 6:
                jk jkVar2 = this.f36073b.V;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f36073b.H0);
                return;
            case 8:
                this.f36073b.V.H0();
                return;
            case 9:
                xn xnVar3 = this.f36073b;
                xnVar3.f40118na = null;
                xnVar3.f40104ma = -1;
                View view = xnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                xn xnVar4 = this.f36073b;
                ArrayList arrayList = xnVar4.f40164r6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                xnVar4.f40053i6 = 0;
                xnVar4.getMessagesController().markMentionsAsRead(xnVar4.Q5, xnVar4.b());
                xnVar4.f40065j6 = true;
                xnVar4.Kb(false);
                org.telegram.ui.ActionBar.p1 p1Var = xnVar4.N8;
                if (p1Var != null) {
                    p1Var.dismiss();
                    return;
                }
                return;
            case 11:
                xn xnVar5 = this.f36073b;
                ArrayList arrayList2 = xnVar5.f40164r6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                xnVar5.f40048i1 = 0;
                xnVar5.Bc(true);
                xnVar5.getMessagesController().markReactionsAsRead(xnVar5.Q5, xnVar5.b());
                org.telegram.ui.ActionBar.p1 p1Var2 = xnVar5.N8;
                if (p1Var2 != null) {
                    p1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                xn xnVar6 = this.f36073b;
                ArrayList arrayList3 = xnVar6.f40164r6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                xnVar6.f40060j1 = 0;
                xnVar6.Ac(true);
                xnVar6.getMessagesController().markPollVotesAsRead(xnVar6.Q5, xnVar6.b());
                org.telegram.ui.ActionBar.p1 p1Var3 = xnVar6.N8;
                if (p1Var3 != null) {
                    p1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                xn.n1(this.f36073b);
                return;
            case 14:
                org.telegram.ui.Components.qc.a0(this.f36073b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f36073b.hc(false);
                return;
            case 16:
                xn xnVar7 = this.f36073b;
                xnVar7.D5 = null;
                xnVar7.j8();
                return;
            case 17:
                xn xnVar8 = this.f36073b;
                xnVar8.D5 = null;
                xnVar8.j8();
                return;
            case 18:
                this.f36073b.S6();
                return;
            case 19:
                this.f36073b.finishFragment();
                return;
            case 20:
                this.f36073b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f36073b.I0);
                return;
            case 22:
                xn xnVar9 = this.f36073b;
                xnVar9.z4 = null;
                xnVar9.o9();
                xnVar9.r9();
                return;
            case 23:
                xn xnVar10 = this.f36073b;
                nk nkVar = xnVar10.f40153q8;
                if (nkVar != null && nkVar.getParent() != null) {
                    xnVar10.f40193u0.f1();
                    xnVar10.f40179s8.setDrawingReady(false);
                    xnVar10.f40153q8.setTag(null);
                    xnVar10.U0.removeView(xnVar10.f40153q8);
                    return;
                }
                return;
            case 24:
                xn xnVar11 = this.f36073b;
                xnVar11.f40092l9 = false;
                xnVar11.e9(true);
                return;
            case 25:
                xn xnVar12 = this.f36073b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar12.P8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    xnVar12.P8[0].performAccessibilityAction(64, null);
                    xnVar12.P8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                xn xnVar13 = this.f36073b;
                if (xnVar13.getParentActivity() != null && xnVar13.fragmentView != null && (jkVar = xnVar13.V) != null && (sendButton = jkVar.getSendButton()) != null && xnVar13.V.getEditField() != null && xnVar13.V.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (xnVar13.f39986d2 == null) {
                        ej ejVar = new ej(4, 0, xnVar13.getParentActivity(), xnVar13.f39968ba, false);
                        xnVar13.f39986d2 = ejVar;
                        ejVar.a();
                        xnVar13.f39986d2.setAlpha(0.0f);
                        xnVar13.f39986d2.setVisibility(4);
                        xnVar13.f39986d2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        xnVar13.U0.addView(xnVar13.f39986d2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar13.f39986d2.f(sendButton, true);
                    xnVar13.f39999e2 = true;
                    return;
                }
                return;
            case 27:
                xn xnVar14 = this.f36073b;
                if (xnVar14.getParentActivity() != null && xnVar14.fragmentView != null && xnVar14.V != null && xnVar14.Ba == null && xnVar14.getMessagesController().getSendPaidMessagesStars(xnVar14.a()) <= 0 && (sendButton2 = xnVar14.V.getSendButton()) != null && xnVar14.V.getEditField() != null && xnVar14.V.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (xnVar14.f40012f2 == null) {
                        org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(4, xnVar14.getParentActivity(), xnVar14.f39968ba, false);
                        xnVar14.f40012f2 = k40Var;
                        k40Var.a();
                        xnVar14.f40012f2.setAlpha(0.0f);
                        xnVar14.f40012f2.setVisibility(4);
                        xnVar14.f40012f2.setText(LocaleController.getString(R.string.ScheduledHint));
                        xnVar14.U0.addView(xnVar14.f40012f2, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    xnVar14.f40012f2.f(sendButton2, true);
                    xnVar14.f40024g2 = true;
                    return;
                }
                return;
            case 28:
                this.f36073b.g8(false, true, 0.0f);
                return;
            default:
                xn xnVar15 = this.f36073b;
                xnVar15.f40234x0.J.clear();
                jm jmVar = xnVar15.f40234x0;
                jmVar.I = false;
                jmVar.O(true);
                xnVar15.Pb(false);
                return;
        }
    }
}
