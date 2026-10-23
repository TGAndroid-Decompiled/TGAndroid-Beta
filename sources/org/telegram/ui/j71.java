package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class j71 implements Runnable {
    public final int f38201a;
    public final x71 f38202b;

    public j71(x71 x71Var, int i10) {
        this.f38201a = i10;
        this.f38202b = x71Var;
    }

    @Override
    public final void run() {
        switch (this.f38201a) {
            case 0:
                this.f38202b.f43128c.W2.N(true);
                return;
            case 1:
                pf.d.r(this.f38202b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                x71 x71Var = this.f38202b;
                x71Var.f43128c.postOnAnimation(new j71(x71Var, 3));
                return;
            case 3:
                this.f38202b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38202b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
