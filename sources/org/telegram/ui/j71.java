package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class j71 implements Runnable {
    public final int f38200a;
    public final x71 f38201b;

    public j71(x71 x71Var, int i10) {
        this.f38200a = i10;
        this.f38201b = x71Var;
    }

    @Override
    public final void run() {
        switch (this.f38200a) {
            case 0:
                this.f38201b.f43127c.W2.N(true);
                return;
            case 1:
                pf.d.r(this.f38201b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                x71 x71Var = this.f38201b;
                x71Var.f43127c.postOnAnimation(new j71(x71Var, 3));
                return;
            case 3:
                this.f38201b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38201b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
