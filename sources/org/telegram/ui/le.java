package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f35443a;
    public final zn f35444b;
    public final long f35445c;

    public le(long j3, zn znVar) {
        this.f35443a = 7;
        this.f35445c = j3;
        this.f35444b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f35443a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35445c, r1, true, this.f35444b.classGuid);
                return;
            case 1:
                this.f35444b.getMessagesController().loadFullChat(this.f35445c, 0, true);
                return;
            case 2:
                zn znVar = this.f35444b;
                LongSparseIntArray longSparseIntArray = znVar.M5;
                long j3 = this.f35445c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.n31 n31Var = znVar.R1;
                if (n31Var != null) {
                    n31Var.setAllTopicsHidden(false);
                }
                if (j3 == znVar.f40306d4) {
                    znVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                zn znVar2 = this.f35444b;
                znVar2.getClass();
                znVar2.presentFragment(zn.R9(this.f35445c));
                return;
            case 4:
                zn znVar3 = this.f35444b;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.f35445c));
                return;
            case 5:
                zn znVar4 = this.f35444b;
                org.telegram.ui.Components.pc v = org.telegram.ui.Components.xc.v(znVar4.getParentActivity(), znVar4, null, 1, this.f35445c, 1, znVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f27312k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f35444b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35445c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35444b.presentFragment(new ProfileActivity(v7.j0.e(this.f35445c, "user_id"), null));
                return;
        }
    }

    public le(zn znVar, long j3, int i10) {
        this.f35443a = i10;
        this.f35444b = znVar;
        this.f35445c = j3;
    }
}
