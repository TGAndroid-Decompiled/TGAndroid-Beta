package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m81 implements Runnable {
    public final int f35501a;
    public final z81 f35502b;

    public m81(z81 z81Var, int i10) {
        this.f35501a = i10;
        this.f35502b = z81Var;
    }

    @Override
    public final void run() {
        switch (this.f35501a) {
            case 0:
                this.f35502b.f40413c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f35502b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z81 z81Var = this.f35502b;
                z81Var.f40413c.postOnAnimation(new m81(z81Var, 3));
                return;
            case 3:
                this.f35502b.i0();
                return;
            default:
                MessagesController.getInstance(this.f35502b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
