package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class kf implements Runnable {
    public final int f40928a;
    public final un f40929b;

    public kf(un unVar, int i10) {
        this.f40928a = i10;
        this.f40929b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        hk hkVar;
        View sendButton;
        switch (this.f40928a) {
            case 0:
                this.f40929b.H7(true);
                return;
            case 1:
                this.f40929b.H7(true);
                return;
            case 2:
                un unVar = this.f40929b;
                unVar.H7(false);
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new qe(unVar, 2));
                y0Var.show();
                return;
            case 3:
                un.p0(this.f40929b);
                return;
            case 4:
                un.n1(this.f40929b);
                return;
            case 5:
                un unVar2 = this.f40929b;
                if (unVar2.getUserConfig().isPremium()) {
                    unVar2.f44293ic = null;
                    unVar2.dd(true);
                    org.telegram.ui.Components.wc.b0(unVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    unVar2.getMessagesController().disableAds(true);
                    return;
                }
                unVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar2, 3, true));
                return;
            case 6:
                hk hkVar2 = this.f40929b.Y;
                if (hkVar2 != null) {
                    hkVar2.n0(true);
                    return;
                }
                return;
            case 7:
                un unVar3 = this.f40929b;
                unVar3.resumeDelayedFragmentAnimation();
                pk pkVar = unVar3.ia;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                unVar3.getNotificationCenter().runDelayedNotifications();
                return;
            case 8:
                un unVar4 = this.f40929b;
                unVar4.Ca = null;
                unVar4.Ba = -1;
                View view = unVar4.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 9:
                un unVar5 = this.f40929b;
                ArrayList arrayList = unVar5.G6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                unVar5.f44477x6 = 0;
                unVar5.getMessagesController().markMentionsAsRead(unVar5.f44252f6, unVar5.b());
                unVar5.f44489y6 = true;
                unVar5.Wb(false);
                org.telegram.ui.ActionBar.o1 o1Var = unVar5.f44216c9;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 10:
                un unVar6 = this.f40929b;
                ArrayList arrayList2 = unVar6.G6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                unVar6.f44472x1 = 0;
                unVar6.Oc(true);
                unVar6.getMessagesController().markReactionsAsRead(unVar6.f44252f6, unVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = unVar6.f44216c9;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 11:
                un unVar7 = this.f40929b;
                ArrayList arrayList3 = unVar7.G6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                unVar7.f44485y1 = 0;
                unVar7.Nc(true);
                unVar7.getMessagesController().markPollVotesAsRead(unVar7.f44252f6, unVar7.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = unVar7.f44216c9;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 12:
                this.f40929b.Y.F0();
                return;
            case 13:
                un.x0(this.f40929b);
                return;
            case 14:
                org.telegram.ui.Components.wc.b0(this.f40929b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 15:
                this.f40929b.L6(false, false, false);
                return;
            case 16:
                this.f40929b.L6(false, true, false);
                return;
            case 17:
                this.f40929b.L6(true, false, false);
                return;
            case 18:
                this.f40929b.finishFragment();
                return;
            case 19:
                this.f40929b.n8(false, true, 0.0f);
                return;
            case 20:
                this.f40929b.n8(false, true, 0.0f);
                return;
            case 21:
                AndroidUtilities.removeFromParent(this.f40929b.V0);
                return;
            case 22:
                this.f40929b.uc(false);
                return;
            case 23:
                this.f40929b.n8(false, true, 0.0f);
                return;
            case 24:
                this.f40929b.Z6();
                return;
            case 25:
                un unVar8 = this.f40929b;
                unVar8.O4 = null;
                unVar8.x9();
                unVar8.z9();
                return;
            case 26:
                un unVar9 = this.f40929b;
                kk kkVar = unVar9.F8;
                if (kkVar != null && kkVar.getParent() != null) {
                    unVar9.f44471x0.g1();
                    unVar9.H8.setDrawingReady(false);
                    unVar9.F8.setTag(null);
                    unVar9.f44295j1.removeView(unVar9.F8);
                    return;
                }
                return;
            case 27:
                un unVar10 = this.f40929b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = unVar10.f44242e9;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    unVar10.f44242e9[0].performAccessibilityAction(64, null);
                    unVar10.f44242e9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 28:
                un unVar11 = this.f40929b;
                unVar11.A9 = false;
                unVar11.o9(true);
                return;
            default:
                un unVar12 = this.f40929b;
                if (unVar12.getParentActivity() != null && unVar12.fragmentView != null && (hkVar = unVar12.Y) != null && (sendButton = hkVar.getSendButton()) != null && unVar12.Y.getEditField() != null && unVar12.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (unVar12.f44407s2 == null) {
                        bj bjVar = new bj(4, 0, unVar12.getParentActivity(), unVar12.f44388qa, false);
                        unVar12.f44407s2 = bjVar;
                        bjVar.a();
                        unVar12.f44407s2.setAlpha(0.0f);
                        unVar12.f44407s2.setVisibility(4);
                        unVar12.f44407s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        unVar12.f44295j1.addView(unVar12.f44407s2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar12.f44407s2.f(sendButton, true);
                    unVar12.f44420t2 = true;
                    return;
                }
                return;
        }
    }
}
