package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class df implements Runnable {
    public final int f37534a;
    public final tn f37535b;

    public df(tn tnVar, int i10) {
        this.f37534a = i10;
        this.f37535b = tnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        dk dkVar;
        View sendButton;
        View sendButton2;
        switch (this.f37534a) {
            case 0:
                this.f37535b.A7(true);
                return;
            case 1:
                this.f37535b.A7(true);
                return;
            case 2:
                tn tnVar = this.f37535b;
                tnVar.A7(false);
                cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 24, true);
                p1Var.setDimBehind(false);
                p1Var.setOnHideListener(new xf(tnVar, 1));
                p1Var.show();
                return;
            case 3:
                tn.P0(this.f37535b);
                return;
            case 4:
                tn.m0(this.f37535b);
                return;
            case 5:
                tn tnVar2 = this.f37535b;
                if (tnVar2.getUserConfig().isPremium()) {
                    tnVar2.Ib = null;
                    tnVar2.Qc(true);
                    org.telegram.ui.Components.tc.a0(tnVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    tnVar2.getMessagesController().disableAds(true);
                    return;
                }
                tnVar2.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar2, 3, true));
                return;
            case 6:
                dk dkVar2 = this.f37535b.U;
                if (dkVar2 != null) {
                    dkVar2.q0(true);
                    return;
                }
                return;
            case 7:
                AndroidUtilities.removeFromParent(this.f37535b.G0);
                return;
            case 8:
                this.f37535b.U.H0();
                return;
            case 9:
                tn tnVar3 = this.f37535b;
                tnVar3.ma = null;
                tnVar3.f42885la = -1;
                View view = tnVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                tn tnVar4 = this.f37535b;
                ArrayList arrayList = tnVar4.q6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                tnVar4.f42832h6 = 0;
                tnVar4.getMessagesController().markMentionsAsRead(tnVar4.P5, tnVar4.b());
                tnVar4.f42844i6 = true;
                tnVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = tnVar4.M8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 11:
                tn tnVar5 = this.f37535b;
                ArrayList arrayList2 = tnVar5.q6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                tnVar5.f42827h1 = 0;
                tnVar5.Bc(true);
                tnVar5.getMessagesController().markReactionsAsRead(tnVar5.P5, tnVar5.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = tnVar5.M8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                tn tnVar6 = this.f37535b;
                ArrayList arrayList3 = tnVar6.q6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                tnVar6.f42839i1 = 0;
                tnVar6.Ac(true);
                tnVar6.getMessagesController().markPollVotesAsRead(tnVar6.P5, tnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = tnVar6.M8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                tn.n1(this.f37535b);
                return;
            case 14:
                org.telegram.ui.Components.tc.a0(this.f37535b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f37535b.hc(false);
                return;
            case 16:
                tn tnVar7 = this.f37535b;
                tnVar7.C5 = null;
                tnVar7.j8();
                return;
            case 17:
                tn tnVar8 = this.f37535b;
                tnVar8.C5 = null;
                tnVar8.j8();
                return;
            case 18:
                this.f37535b.S6();
                return;
            case 19:
                this.f37535b.finishFragment();
                return;
            case 20:
                this.f37535b.g8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f37535b.H0);
                return;
            case 22:
                tn tnVar9 = this.f37535b;
                tnVar9.f43042y4 = null;
                tnVar9.o9();
                tnVar9.r9();
                return;
            case 23:
                tn tnVar10 = this.f37535b;
                hk hkVar = tnVar10.f42932p8;
                if (hkVar != null && hkVar.getParent() != null) {
                    tnVar10.f42973t0.f1();
                    tnVar10.f42955r8.setDrawingReady(false);
                    tnVar10.f42932p8.setTag(null);
                    tnVar10.T0.removeView(tnVar10.f42932p8);
                    return;
                }
                return;
            case 24:
                tn tnVar11 = this.f37535b;
                tnVar11.k9 = false;
                tnVar11.e9(true);
                return;
            case 25:
                tn tnVar12 = this.f37535b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = tnVar12.O8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    tnVar12.O8[0].performAccessibilityAction(64, null);
                    tnVar12.O8[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 26:
                tn tnVar13 = this.f37535b;
                if (tnVar13.getParentActivity() != null && tnVar13.fragmentView != null && (dkVar = tnVar13.U) != null && (sendButton = dkVar.getSendButton()) != null && tnVar13.U.getEditField() != null && tnVar13.U.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (tnVar13.f42766c2 == null) {
                        zi ziVar = new zi(4, 0, tnVar13.getParentActivity(), tnVar13.f42746aa, false);
                        tnVar13.f42766c2 = ziVar;
                        ziVar.a();
                        tnVar13.f42766c2.setAlpha(0.0f);
                        tnVar13.f42766c2.setVisibility(4);
                        tnVar13.f42766c2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        tnVar13.T0.addView(tnVar13.f42766c2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    tnVar13.f42766c2.f(sendButton, true);
                    tnVar13.f42777d2 = true;
                    return;
                }
                return;
            case 27:
                tn tnVar14 = this.f37535b;
                if (tnVar14.getParentActivity() != null && tnVar14.fragmentView != null && tnVar14.U != null && tnVar14.Aa == null && tnVar14.getMessagesController().getSendPaidMessagesStars(tnVar14.a()) <= 0 && (sendButton2 = tnVar14.U.getSendButton()) != null && tnVar14.U.getEditField() != null && tnVar14.U.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (tnVar14.f42790e2 == null) {
                        org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(4, tnVar14.getParentActivity(), tnVar14.f42746aa, false);
                        tnVar14.f42790e2 = g40Var;
                        g40Var.a();
                        tnVar14.f42790e2.setAlpha(0.0f);
                        tnVar14.f42790e2.setVisibility(4);
                        tnVar14.f42790e2.setText(LocaleController.getString(R.string.ScheduledHint));
                        tnVar14.T0.addView(tnVar14.f42790e2, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    tnVar14.f42790e2.f(sendButton2, true);
                    tnVar14.f42804f2 = true;
                    return;
                }
                return;
            case 28:
                this.f37535b.g8(false, true, 0.0f);
                return;
            default:
                tn tnVar15 = this.f37535b;
                tnVar15.f43013w0.I.clear();
                em emVar = tnVar15.f43013w0;
                emVar.H = false;
                emVar.O(true);
                tnVar15.Pb(false);
                return;
        }
    }
}
