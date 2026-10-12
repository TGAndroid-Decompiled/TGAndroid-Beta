package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class c91 implements Runnable {
    public final int f34764a;
    public final o91 f34765b;

    public c91(o91 o91Var, int i10) {
        this.f34764a = i10;
        this.f34765b = o91Var;
    }

    @Override
    public final void run() {
        switch (this.f34764a) {
            case 0:
                this.f34765b.f38897c.W2.N(true);
                return;
            case 1:
                pf.d.s(this.f34765b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                o91 o91Var = this.f34765b;
                o91Var.f38897c.postOnAnimation(new c91(o91Var, 3));
                return;
            case 3:
                this.f34765b.i0();
                return;
            default:
                MessagesController.getInstance(this.f34765b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
