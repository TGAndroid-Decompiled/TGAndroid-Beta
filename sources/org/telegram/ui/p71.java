package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class p71 implements Runnable {
    public final int f42392a;
    public final d81 f42393b;

    public p71(d81 d81Var, int i10) {
        this.f42392a = i10;
        this.f42393b = d81Var;
    }

    @Override
    public final void run() {
        switch (this.f42392a) {
            case 0:
                MessagesController.getInstance(this.f42393b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                qf.d.r(this.f42393b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            default:
                this.f42393b.f38762c.f32152g3.O(true);
                return;
        }
    }
}
