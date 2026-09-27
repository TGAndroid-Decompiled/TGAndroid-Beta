package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o81 implements Runnable {
    public final int f36157a;
    public final a91 f36158b;

    public o81(a91 a91Var, int i10) {
        this.f36157a = i10;
        this.f36158b = a91Var;
    }

    @Override
    public final void run() {
        switch (this.f36157a) {
            case 0:
                MessagesController.getInstance(this.f36158b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                this.f36158b.f32014c.Y2.N(true);
                return;
            default:
                nf.f.s(this.f36158b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
        }
    }
}
