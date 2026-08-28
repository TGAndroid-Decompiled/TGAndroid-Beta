package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m71 implements Runnable {
    public final int f40345a;
    public final z71 f40346b;

    public m71(z71 z71Var, int i9) {
        this.f40345a = i9;
        this.f40346b = z71Var;
    }

    @Override
    public final void run() {
        switch (this.f40345a) {
            case 0:
                this.f40346b.f45062c.U2.N(true);
                return;
            case 1:
                ve.e.s(this.f40346b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z71 z71Var = this.f40346b;
                z71Var.f45062c.postOnAnimation(new m71(z71Var, 3));
                return;
            case 3:
                this.f40346b.h0();
                return;
            default:
                MessagesController.getInstance(this.f40346b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
