package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m81 implements Runnable {
    public final int f35488a;
    public final z81 f35489b;

    public m81(z81 z81Var, int i10) {
        this.f35488a = i10;
        this.f35489b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f35488a) {
            case 0:
                this.f35489b.f40396c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f35489b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z81 z81Var = this.f35489b;
                z81Var.f40396c.postOnAnimation(new m81(z81Var, 3));
                return;
            case 3:
                this.f35489b.i0();
                return;
            default:
                MessagesController.getInstance(this.f35489b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
