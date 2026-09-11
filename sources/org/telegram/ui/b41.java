package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f34630a;
    public final d41 f34631b;

    public b41(d41 d41Var, int i10) {
        this.f34630a = i10;
        this.f34631b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f34630a) {
            case 0:
                d41 d41Var = this.f34631b;
                e41 e41Var = d41Var.v;
                if (d41Var.f35645a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f34631b.f35650n.f22074b);
                return;
        }
    }
}
