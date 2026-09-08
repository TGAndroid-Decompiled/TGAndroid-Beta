package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f34657a;
    public final d41 f34658b;

    public b41(d41 d41Var, int i10) {
        this.f34657a = i10;
        this.f34658b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f34657a) {
            case 0:
                d41 d41Var = this.f34658b;
                e41 e41Var = d41Var.v;
                if (d41Var.f35672a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f34658b.f35677n.f22101b);
                return;
        }
    }
}
