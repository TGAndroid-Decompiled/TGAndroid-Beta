package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class je implements Runnable {
    public final int f38230a;
    public final qn f38231b;
    public final long f38232c;

    public je(long j10, qn qnVar) {
        this.f38230a = 7;
        this.f38232c = j10;
        this.f38231b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f38230a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38232c, r1, true, this.f38231b.classGuid);
                return;
            case 1:
                this.f38231b.getMessagesController().loadFullChat(this.f38232c, 0, true);
                return;
            case 2:
                qn qnVar = this.f38231b;
                LongSparseIntArray longSparseIntArray = qnVar.M5;
                long j10 = this.f38232c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.r31 r31Var = qnVar.R1;
                if (r31Var != null) {
                    r31Var.setAllTopicsHidden(false);
                }
                if (j10 == qnVar.f40650d4) {
                    qnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                qn qnVar2 = this.f38231b;
                qnVar2.getClass();
                qnVar2.presentFragment(qn.W9(this.f38232c));
                return;
            case 4:
                qn qnVar3 = this.f38231b;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(this.f38232c));
                return;
            case 5:
                qn qnVar4 = this.f38231b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(qnVar4.getParentActivity(), qnVar4, null, 1, this.f38232c, 1, qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f29595k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f38231b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38232c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38231b.presentFragment(new ProfileActivity(zf.d0.b(this.f38232c, "user_id"), null));
                return;
        }
    }

    public je(qn qnVar, long j10, int i10) {
        this.f38230a = i10;
        this.f38231b = qnVar;
        this.f38232c = j10;
    }
}
