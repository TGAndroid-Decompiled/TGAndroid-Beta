package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class j81 implements Runnable {
    public final int f37880a;
    public final v81 f37881b;

    public j81(v81 v81Var, int i10) {
        this.f37880a = i10;
        this.f37881b = v81Var;
    }

    @Override
    public final void run() {
        switch (this.f37880a) {
            case 0:
                this.f37881b.f42046c.V2.N(true);
                return;
            case 1:
                af.g.s(this.f37881b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                v81 v81Var = this.f37881b;
                v81Var.f42046c.postOnAnimation(new j81(v81Var, 3));
                return;
            case 3:
                this.f37881b.i0();
                return;
            default:
                MessagesController.getInstance(this.f37881b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
