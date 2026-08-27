package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class l71 implements Runnable {

    public final int f39973a;

    public final x71 f39974b;

    public l71(x71 x71Var, int i10) {
        this.f39973a = i10;
        this.f39974b = x71Var;
    }

    @Override
    public final void run() {
        switch (this.f39973a) {
            case 0:
                this.f39974b.f44306c.U2.N(true);
                break;
            case 1:
                we.e.s(this.f39974b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                x71 x71Var = this.f39974b;
                x71Var.f44306c.postOnAnimation(new l71(x71Var, 3));
                break;
            case 3:
                this.f39974b.i0();
                break;
            default:
                MessagesController.getInstance(this.f39974b.currentAccount).deleteUserPhoto(null);
                break;
        }
    }
}
