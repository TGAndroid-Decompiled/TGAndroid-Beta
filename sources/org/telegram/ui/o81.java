package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o81 implements Runnable {
    public final int f39128a;
    public final a91 f39129b;

    public o81(a91 a91Var, int i10) {
        this.f39128a = i10;
        this.f39129b = a91Var;
    }

    @Override
    public final void run() {
        switch (this.f39128a) {
            case 0:
                MessagesController.getInstance(this.f39129b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                this.f39129b.f34739c.f25245f3.N(true);
                return;
            default:
                nf.f.s(this.f39129b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
        }
    }
}
