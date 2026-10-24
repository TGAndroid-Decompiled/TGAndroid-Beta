package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m71 implements Runnable {
    public final int f39453a;
    public final b81 f39454b;

    public m71(b81 b81Var, int i10) {
        this.f39453a = i10;
        this.f39454b = b81Var;
    }

    @Override
    public final void run() {
        switch (this.f39453a) {
            case 0:
                MessagesController.getInstance(this.f39454b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                this.f39454b.f35956c.Z2.N(true);
                return;
            case 2:
                pf.d.r(this.f39454b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 3:
                b81 b81Var = this.f39454b;
                b81Var.f35956c.postOnAnimation(new m71(b81Var, 4));
                return;
            default:
                this.f39454b.k0();
                return;
        }
    }
}
