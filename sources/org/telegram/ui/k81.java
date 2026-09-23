package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class k81 implements Runnable {
    public final int f34602a;
    public final x81 f34603b;

    public k81(x81 x81Var, int i10) {
        this.f34602a = i10;
        this.f34603b = x81Var;
    }

    @Override
    public final void run() {
        switch (this.f34602a) {
            case 0:
                this.f34603b.f39210c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f34603b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                x81 x81Var = this.f34603b;
                x81Var.f39210c.postOnAnimation(new k81(x81Var, 3));
                return;
            case 3:
                this.f34603b.i0();
                return;
            default:
                MessagesController.getInstance(this.f34603b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
