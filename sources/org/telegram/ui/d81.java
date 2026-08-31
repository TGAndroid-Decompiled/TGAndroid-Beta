package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class d81 implements Runnable {
    public final int f36143a;
    public final p81 f36144b;

    public d81(p81 p81Var, int i10) {
        this.f36143a = i10;
        this.f36144b = p81Var;
    }

    @Override
    public final void run() {
        switch (this.f36143a) {
            case 0:
                this.f36144b.f39949c.V2.N(true);
                return;
            case 1:
                af.g.s(this.f36144b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                p81 p81Var = this.f36144b;
                p81Var.f39949c.postOnAnimation(new d81(p81Var, 3));
                return;
            case 3:
                this.f36144b.i0();
                return;
            default:
                MessagesController.getInstance(this.f36144b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
