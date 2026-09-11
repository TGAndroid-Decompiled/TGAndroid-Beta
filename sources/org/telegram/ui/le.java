package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f38309a;
    public final co f38310b;
    public final long f38311c;

    public le(long j3, co coVar) {
        this.f38309a = 7;
        this.f38311c = j3;
        this.f38310b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f38309a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38311c, r1, true, this.f38310b.classGuid);
                return;
            case 1:
                this.f38310b.getMessagesController().loadFullChat(this.f38311c, 0, true);
                return;
            case 2:
                co coVar = this.f38310b;
                LongSparseIntArray longSparseIntArray = coVar.M5;
                long j3 = this.f38311c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w21 w21Var = coVar.R1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j3 == coVar.f35228d4) {
                    coVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                co coVar2 = this.f38310b;
                coVar2.getClass();
                coVar2.presentFragment(co.R9(this.f38311c));
                return;
            case 4:
                co coVar3 = this.f38310b;
                coVar3.getClass();
                coVar3.presentFragment(ProfileActivity.m4(this.f38311c));
                return;
            case 5:
                co coVar4 = this.f38310b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.yc.v(coVar4.getParentActivity(), coVar4, null, 1, this.f38311c, 1, coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f29680k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.yc.a0(this.f38310b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38311c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38310b.presentFragment(new ProfileActivity(w.f.e(this.f38311c, "user_id"), null));
                return;
        }
    }

    public le(co coVar, long j3, int i10) {
        this.f38309a = i10;
        this.f38310b = coVar;
        this.f38311c = j3;
    }
}
