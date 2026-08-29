package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class p71 implements Runnable {
    public final int f41311a;
    public final b81 f41312b;

    public p71(b81 b81Var, int i10) {
        this.f41311a = i10;
        this.f41312b = b81Var;
    }

    @Override
    public final void run() {
        switch (this.f41311a) {
            case 0:
                this.f41312b.f36719c.U2.N(true);
                return;
            case 1:
                ye.d.s(this.f41312b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                b81 b81Var = this.f41312b;
                b81Var.f36719c.postOnAnimation(new p71(b81Var, 3));
                return;
            case 3:
                this.f41312b.i0();
                return;
            default:
                MessagesController.getInstance(this.f41312b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
