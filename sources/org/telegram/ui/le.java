package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f38336a;
    public final co f38337b;
    public final long f38338c;

    public le(long j3, co coVar) {
        this.f38336a = 7;
        this.f38338c = j3;
        this.f38337b = coVar;
    }

    @Override
    public final void run() {
        switch (this.f38336a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38338c, r1, true, this.f38337b.classGuid);
                return;
            case 1:
                this.f38337b.getMessagesController().loadFullChat(this.f38338c, 0, true);
                return;
            case 2:
                co coVar = this.f38337b;
                LongSparseIntArray longSparseIntArray = coVar.M5;
                long j3 = this.f38338c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w21 w21Var = coVar.R1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j3 == coVar.f35255d4) {
                    coVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                co coVar2 = this.f38337b;
                coVar2.getClass();
                coVar2.presentFragment(co.R9(this.f38338c));
                return;
            case 4:
                co coVar3 = this.f38337b;
                coVar3.getClass();
                coVar3.presentFragment(ProfileActivity.m4(this.f38338c));
                return;
            case 5:
                co coVar4 = this.f38337b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.yc.v(coVar4.getParentActivity(), coVar4, null, 1, this.f38338c, 1, coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f29707k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.yc.a0(this.f38337b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38338c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38337b.presentFragment(new ProfileActivity(w.f.e(this.f38338c, "user_id"), null));
                return;
        }
    }

    public le(co coVar, long j3, int i10) {
        this.f38336a = i10;
        this.f38337b = coVar;
        this.f38338c = j3;
    }
}
