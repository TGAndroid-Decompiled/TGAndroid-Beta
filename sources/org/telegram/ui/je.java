package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class je implements Runnable {
    public final int f38237a;
    public final qn f38238b;
    public final long f38239c;

    public je(long j10, qn qnVar) {
        this.f38237a = 7;
        this.f38239c = j10;
        this.f38238b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f38237a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38239c, r1, true, this.f38238b.classGuid);
                return;
            case 1:
                this.f38238b.getMessagesController().loadFullChat(this.f38239c, 0, true);
                return;
            case 2:
                qn qnVar = this.f38238b;
                LongSparseIntArray longSparseIntArray = qnVar.M5;
                long j10 = this.f38239c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.s31 s31Var = qnVar.R1;
                if (s31Var != null) {
                    s31Var.setAllTopicsHidden(false);
                }
                if (j10 == qnVar.f40656d4) {
                    qnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                qn qnVar2 = this.f38238b;
                qnVar2.getClass();
                qnVar2.presentFragment(qn.W9(this.f38239c));
                return;
            case 4:
                qn qnVar3 = this.f38238b;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(this.f38239c));
                return;
            case 5:
                qn qnVar4 = this.f38238b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(qnVar4.getParentActivity(), qnVar4, null, 1, this.f38239c, 1, qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f29532k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f38238b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38239c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38238b.presentFragment(new ProfileActivity(zf.d0.b(this.f38239c, "user_id"), null));
                return;
        }
    }

    public je(qn qnVar, long j10, int i10) {
        this.f38237a = i10;
        this.f38238b = qnVar;
        this.f38239c = j10;
    }
}
