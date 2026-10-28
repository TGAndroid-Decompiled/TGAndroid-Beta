package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class jf implements Runnable {
    public final int f40523a;
    public final wn f40524b;

    public jf(wn wnVar, int i10) {
        this.f40523a = i10;
        this.f40524b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f40523a) {
            case 0:
                wn wnVar = this.f40524b;
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f45339x0, (Utilities.Callback<View>) new di.e(11));
                hm hmVar = wnVar.A0;
                if (hmVar != null) {
                    hmVar.O(false);
                    return;
                }
                return;
            case 1:
                this.f40524b.J7(true);
                return;
            case 2:
                this.f40524b.J7(true);
                return;
            case 3:
                this.f40524b.Lc();
                return;
            case 4:
                wn wnVar2 = this.f40524b;
                wnVar2.J7(false);
                tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) wnVar2, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new pe(wnVar2, 7));
                y0Var.show();
                return;
            case 5:
                wn.y1(this.f40524b);
                return;
            case 6:
                wn wnVar3 = this.f40524b;
                if (wnVar3.getUserConfig().isPremium()) {
                    wnVar3.f45209mc = null;
                    wnVar3.hd(true);
                    org.telegram.ui.Components.wc.b0(wnVar3).c(LocaleController.getString(R.string.AdHidden)).j();
                    wnVar3.getMessagesController().disableAds(true);
                    return;
                }
                wnVar3.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar3, 3, true));
                return;
            case 7:
                wn.W(this.f40524b);
                return;
            case 8:
                jk jkVar = this.f40524b.Y;
                if (jkVar != null) {
                    jkVar.m0(true);
                    return;
                }
                return;
            case 9:
                wn wnVar4 = this.f40524b;
                wnVar4.Ga = null;
                wnVar4.Fa = -1;
                View view = wnVar4.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                wn wnVar5 = this.f40524b;
                ArrayList arrayList = wnVar5.K6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                wnVar5.B6 = 0;
                wnVar5.getMessagesController().markMentionsAsRead(wnVar5.f45168j6, wnVar5.b());
                wnVar5.C6 = true;
                wnVar5.ac(false);
                org.telegram.ui.ActionBar.o1 o1Var = wnVar5.f45134g9;
                if (o1Var != null) {
                    o1Var.dismiss();
                    return;
                }
                return;
            case 11:
                wn wnVar6 = this.f40524b;
                ArrayList arrayList2 = wnVar6.K6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                wnVar6.f45340x1 = 0;
                wnVar6.Sc(true);
                wnVar6.getMessagesController().markReactionsAsRead(wnVar6.f45168j6, wnVar6.b());
                org.telegram.ui.ActionBar.o1 o1Var2 = wnVar6.f45134g9;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                wn wnVar7 = this.f40524b;
                ArrayList arrayList3 = wnVar7.K6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                wnVar7.f45353y1 = 0;
                wnVar7.Rc(true);
                wnVar7.getMessagesController().markPollVotesAsRead(wnVar7.f45168j6, wnVar7.b());
                org.telegram.ui.ActionBar.o1 o1Var3 = wnVar7.f45134g9;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                wn.d0(this.f40524b);
                return;
            case 14:
                this.f40524b.Y.E0();
                return;
            case 15:
                this.f40524b.p8(false, true, 0.0f);
                return;
            case 16:
                this.f40524b.N6(false, false, false);
                return;
            case 17:
                this.f40524b.N6(false, true, false);
                return;
            case 18:
                this.f40524b.N6(true, false, false);
                return;
            case 19:
                org.telegram.ui.Components.wc.b0(this.f40524b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                return;
            case 20:
                this.f40524b.finishFragment();
                return;
            case 21:
                wn wnVar8 = this.f40524b;
                wnVar8.W5 = null;
                wnVar8.s8();
                return;
            case 22:
                wn wnVar9 = this.f40524b;
                wnVar9.W5 = null;
                wnVar9.s8();
                return;
            case 23:
                AndroidUtilities.removeFromParent(this.f40524b.V0);
                return;
            case 24:
                wn wnVar10 = this.f40524b;
                wnVar10.O4 = null;
                wnVar10.A9();
                wnVar10.C9();
                return;
            case 25:
                this.f40524b.b7();
                return;
            case 26:
                this.f40524b.yc(false);
                return;
            case 27:
                this.f40524b.p8(false, true, 0.0f);
                return;
            case 28:
                wn wnVar11 = this.f40524b;
                mk mkVar = wnVar11.J8;
                if (mkVar != null && mkVar.getParent() != null) {
                    wnVar11.f45339x0.g1();
                    wnVar11.L8.setDrawingReady(false);
                    wnVar11.J8.setTag(null);
                    wnVar11.f45163j1.removeView(wnVar11.J8);
                    return;
                }
                return;
            default:
                wn wnVar12 = this.f40524b;
                wnVar12.E9 = false;
                wnVar12.r9(true);
                return;
        }
    }
}
