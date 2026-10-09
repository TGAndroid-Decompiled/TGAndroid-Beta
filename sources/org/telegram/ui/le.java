package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f39545a;
    public final zn f39546b;
    public final long f39547c;

    public le(long j3, zn znVar) {
        this.f39545a = 7;
        this.f39547c = j3;
        this.f39546b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f39545a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f39547c, r1, true, this.f39546b.classGuid);
                return;
            case 1:
                this.f39546b.getMessagesController().loadFullChat(this.f39547c, 0, true);
                return;
            case 2:
                zn znVar = this.f39546b;
                LongSparseIntArray longSparseIntArray = znVar.M5;
                long j3 = this.f39547c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.c41 c41Var = znVar.R1;
                if (c41Var != null) {
                    c41Var.setAllTopicsHidden(false);
                }
                if (j3 == znVar.f44742d4) {
                    znVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                zn znVar2 = this.f39546b;
                znVar2.getClass();
                znVar2.presentFragment(zn.W9(this.f39547c));
                return;
            case 4:
                zn znVar3 = this.f39546b;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.f39547c));
                return;
            case 5:
                zn znVar4 = this.f39546b;
                org.telegram.ui.Components.tc v = org.telegram.ui.Components.ad.v(znVar4.getParentActivity(), znVar4, null, 1, this.f39547c, 1, znVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), znVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.f31131k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.ad.a0(this.f39546b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f39547c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f39546b.presentFragment(new ProfileActivity(sc.v.f(this.f39547c, "user_id"), null));
                return;
        }
    }

    public le(zn znVar, long j3, int i10) {
        this.f39545a = i10;
        this.f39546b = znVar;
        this.f39547c = j3;
    }
}
