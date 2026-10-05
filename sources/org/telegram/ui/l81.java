package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l81 implements Runnable {
    public final int f38253a;
    public final y81 f38254b;

    public l81(y81 y81Var, int i10) {
        this.f38253a = i10;
        this.f38254b = y81Var;
    }

    @Override
    public final void run() {
        switch (this.f38253a) {
            case 0:
                MessagesController.getInstance(this.f38254b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                nf.f.s(this.f38254b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            default:
                this.f38254b.f43140c.f26034f3.N(true);
                return;
        }
    }
}
