package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class k81 implements Runnable {
    public final int f35444a;
    public final w81 f35445b;

    public k81(w81 w81Var, int i10) {
        this.f35444a = i10;
        this.f35445b = w81Var;
    }

    @Override
    public final void run() {
        switch (this.f35444a) {
            case 0:
                this.f35445b.f39311c.V2.N(true);
                return;
            case 1:
                ze.d.s(this.f35445b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                w81 w81Var = this.f35445b;
                w81Var.f39311c.postOnAnimation(new k81(w81Var, 3));
                return;
            case 3:
                this.f35445b.i0();
                return;
            default:
                MessagesController.getInstance(this.f35445b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
