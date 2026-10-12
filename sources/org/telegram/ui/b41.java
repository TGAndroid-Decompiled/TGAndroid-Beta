package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f36066a;
    public final d41 f36067b;

    public b41(d41 d41Var, int i10) {
        this.f36066a = i10;
        this.f36067b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f36066a) {
            case 0:
                d41 d41Var = this.f36067b;
                e41 e41Var = d41Var.v;
                if (d41Var.f36638a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36067b.f36643n.f22080b);
                return;
        }
    }
}
