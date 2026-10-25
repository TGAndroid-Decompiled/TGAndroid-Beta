package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class p71 implements Runnable {
    public final int f42389a;
    public final d81 f42390b;

    public p71(d81 d81Var, int i10) {
        this.f42389a = i10;
        this.f42390b = d81Var;
    }

    @Override
    public final void run() {
        switch (this.f42389a) {
            case 0:
                MessagesController.getInstance(this.f42390b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                qf.d.r(this.f42390b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            default:
                this.f42390b.f38759c.f32150g3.O(true);
                return;
        }
    }
}
