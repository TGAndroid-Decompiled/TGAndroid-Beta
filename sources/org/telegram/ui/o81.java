package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o81 implements Runnable {
    public final int f39133a;
    public final a91 f39134b;

    public o81(a91 a91Var, int i10) {
        this.f39133a = i10;
        this.f39134b = a91Var;
    }

    @Override
    public final void run() {
        switch (this.f39133a) {
            case 0:
                MessagesController.getInstance(this.f39134b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                nf.f.s(this.f39134b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            default:
                this.f39134b.f34744c.f25250f3.N(true);
                return;
        }
    }
}
