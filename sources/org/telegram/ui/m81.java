package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m81 implements Runnable {
    public final int f35499a;
    public final z81 f35500b;

    public m81(z81 z81Var, int i10) {
        this.f35499a = i10;
        this.f35500b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f35499a) {
            case 0:
                this.f35500b.f40411c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f35500b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z81 z81Var = this.f35500b;
                z81Var.f40411c.postOnAnimation(new m81(z81Var, 3));
                return;
            case 3:
                this.f35500b.i0();
                return;
            default:
                MessagesController.getInstance(this.f35500b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
