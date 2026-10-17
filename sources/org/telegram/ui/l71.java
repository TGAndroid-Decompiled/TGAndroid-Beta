package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l71 implements Runnable {
    public final int f38816a;
    public final z71 f38817b;

    public l71(z71 z71Var, int i10) {
        this.f38816a = i10;
        this.f38817b = z71Var;
    }

    @Override
    public final void run() {
        switch (this.f38816a) {
            case 0:
                this.f38817b.f43654c.W2.N(true);
                return;
            case 1:
                pf.d.r(this.f38817b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                z71 z71Var = this.f38817b;
                z71Var.f43654c.postOnAnimation(new l71(z71Var, 3));
                return;
            case 3:
                this.f38817b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38817b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
