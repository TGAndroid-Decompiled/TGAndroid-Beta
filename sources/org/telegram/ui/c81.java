package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class c81 implements Runnable {
    public final int f33226a;
    public final o81 f33227b;

    public c81(o81 o81Var, int i10) {
        this.f33226a = i10;
        this.f33227b = o81Var;
    }

    @Override
    public final void run() {
        switch (this.f33226a) {
            case 0:
                this.f33227b.f36816c.V2.N(true);
                return;
            case 1:
                af.g.s(this.f33227b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                o81 o81Var = this.f33227b;
                o81Var.f36816c.postOnAnimation(new c81(o81Var, 3));
                return;
            case 3:
                this.f33227b.i0();
                return;
            default:
                MessagesController.getInstance(this.f33227b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
