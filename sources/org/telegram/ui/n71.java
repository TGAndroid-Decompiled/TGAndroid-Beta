package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n71 implements Runnable {
    public final int f39810a;
    public final c81 f39811b;

    public n71(c81 c81Var, int i10) {
        this.f39810a = i10;
        this.f39811b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f39810a) {
            case 0:
                MessagesController.getInstance(this.f39811b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                this.f39811b.f36294c.Z2.N(true);
                return;
            case 2:
                pf.d.r(this.f39811b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 3:
                c81 c81Var = this.f39811b;
                c81Var.f36294c.postOnAnimation(new n71(c81Var, 4));
                return;
            default:
                this.f39811b.k0();
                return;
        }
    }
}
