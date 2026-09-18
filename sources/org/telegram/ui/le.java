package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f35355a;
    public final zn f35356b;
    public final long f35357c;

    public le(long j3, zn znVar) {
        this.f35355a = 7;
        this.f35357c = j3;
        this.f35356b = znVar;
    }

    @Override
    public final void run() {
        switch (this.f35355a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35357c, r1, true, this.f35356b.classGuid);
                return;
            case 1:
                this.f35356b.getMessagesController().loadFullChat(this.f35357c, 0, true);
                return;
            case 2:
                zn znVar = this.f35356b;
                LongSparseIntArray longSparseIntArray = znVar.M5;
                long j3 = this.f35357c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.m31 m31Var = znVar.R1;
                if (m31Var != null) {
                    m31Var.setAllTopicsHidden(false);
                }
                if (j3 == znVar.f40243d4) {
                    znVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                zn znVar2 = this.f35356b;
                znVar2.getClass();
                znVar2.presentFragment(zn.R9(this.f35357c));
                return;
            case 4:
                zn znVar3 = this.f35356b;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.f35357c));
                return;
            case 5:
                zn znVar4 = this.f35356b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(znVar4.getParentActivity(), znVar4, null, 1, this.f35357c, 1, znVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), znVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f27551k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f35356b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35357c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35356b.presentFragment(new ProfileActivity(t8.b.f(this.f35357c, "user_id"), null));
                return;
        }
    }

    public le(zn znVar, long j3, int i10) {
        this.f35355a = i10;
        this.f35356b = znVar;
        this.f35357c = j3;
    }
}
