package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ke implements Runnable {
    public final int f34685a;
    public final xn f34686b;
    public final long f34687c;

    public ke(long j3, xn xnVar) {
        this.f34685a = 7;
        this.f34687c = j3;
        this.f34686b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f34685a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f34687c, r1, true, this.f34686b.classGuid);
                return;
            case 1:
                this.f34686b.getMessagesController().loadFullChat(this.f34687c, 0, true);
                return;
            case 2:
                xn xnVar = this.f34686b;
                LongSparseIntArray longSparseIntArray = xnVar.M5;
                long j3 = this.f34687c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w21 w21Var = xnVar.R1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j3 == xnVar.f39352d4) {
                    xnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                xn xnVar2 = this.f34686b;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.f34687c));
                return;
            case 4:
                xn xnVar3 = this.f34686b;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.f34687c));
                return;
            case 5:
                xn xnVar4 = this.f34686b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.f34687c, 1, xnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), xnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f27307k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f34686b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f34687c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f34686b.presentFragment(new ProfileActivity(w.c.e(this.f34687c, "user_id"), null));
                return;
        }
    }

    public ke(xn xnVar, long j3, int i10) {
        this.f34685a = i10;
        this.f34686b = xnVar;
        this.f34687c = j3;
    }
}
