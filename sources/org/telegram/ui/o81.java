package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o81 implements Runnable {
    public final int f39127a;
    public final a91 f39128b;

    public o81(a91 a91Var, int i10) {
        this.f39127a = i10;
        this.f39128b = a91Var;
    }

    @Override
    public final void run() {
        switch (this.f39127a) {
            case 0:
                MessagesController.getInstance(this.f39128b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                this.f39128b.f34738c.f25244f3.N(true);
                return;
            default:
                nf.f.s(this.f39128b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
        }
    }
}
