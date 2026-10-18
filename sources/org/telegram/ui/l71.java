package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l71 implements Runnable {
    public final int f38807a;
    public final z71 f38808b;

    public l71(z71 z71Var, int i10) {
        this.f38807a = i10;
        this.f38808b = z71Var;
    }

    @Override
    public final void run() {
        switch (this.f38807a) {
            case 0:
                this.f38808b.f43680c.W2.N(true);
                return;
            case 1:
                pf.d.r(this.f38808b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z71 z71Var = this.f38808b;
                z71Var.f43680c.postOnAnimation(new l71(z71Var, 3));
                return;
            case 3:
                this.f38808b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38808b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
