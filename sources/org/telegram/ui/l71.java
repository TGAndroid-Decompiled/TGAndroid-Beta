package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l71 implements Runnable {
    public final int f38762a;
    public final z71 f38763b;

    public l71(z71 z71Var, int i10) {
        this.f38762a = i10;
        this.f38763b = z71Var;
    }

    @Override
    public final void run() {
        switch (this.f38762a) {
            case 0:
                this.f38763b.f43644c.W2.N(true);
                return;
            case 1:
                pf.d.r(this.f38763b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z71 z71Var = this.f38763b;
                z71Var.f43644c.postOnAnimation(new l71(z71Var, 3));
                return;
            case 3:
                this.f38763b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38763b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
