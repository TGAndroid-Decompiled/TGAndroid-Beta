package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m81 implements Runnable {
    public final int f35590a;
    public final z81 f35591b;

    public m81(z81 z81Var, int i10) {
        this.f35590a = i10;
        this.f35591b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f35590a) {
            case 0:
                this.f35591b.f40522c.f28778f3.N(true);
                return;
            case 1:
                nf.f.s(this.f35591b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z81 z81Var = this.f35591b;
                z81Var.f40522c.postOnAnimation(new m81(z81Var, 3));
                return;
            case 3:
                this.f35591b.i0();
                return;
            default:
                MessagesController.getInstance(this.f35591b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
