package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ke implements Runnable {
    public final int f39307a;
    public final zn f39308b;
    public final long f39309c;

    public ke(long j3, zn znVar) {
        this.f39307a = 7;
        this.f39309c = j3;
        this.f39308b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f39307a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f39309c, r1, true, this.f39308b.classGuid);
                return;
            case 1:
                this.f39308b.getMessagesController().loadFullChat(this.f39309c, 0, true);
                return;
            case 2:
                zn znVar = this.f39308b;
                LongSparseIntArray longSparseIntArray = znVar.M5;
                long j3 = this.f39309c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.e41 e41Var = znVar.R1;
                if (e41Var != null) {
                    e41Var.setAllTopicsHidden(false);
                }
                if (j3 == znVar.f44743d4) {
                    znVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                zn znVar2 = this.f39308b;
                znVar2.getClass();
                znVar2.presentFragment(zn.W9(this.f39309c));
                return;
            case 4:
                zn znVar3 = this.f39308b;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.f39309c));
                return;
            case 5:
                zn znVar4 = this.f39308b;
                org.telegram.ui.Components.sc v = org.telegram.ui.Components.ad.v(znVar4.getParentActivity(), znVar4, null, 1, this.f39309c, 1, znVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), znVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f30712k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.ad.a0(this.f39308b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f39309c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f39308b.presentFragment(new ProfileActivity(sc.v.f(this.f39309c, "user_id"), null));
                return;
        }
    }

    public ke(zn znVar, long j3, int i10) {
        this.f39307a = i10;
        this.f39308b = znVar;
        this.f39309c = j3;
    }
}
