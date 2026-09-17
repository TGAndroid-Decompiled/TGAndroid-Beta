package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f34631a;
    public final d41 f34632b;

    public b41(d41 d41Var, int i10) {
        this.f34631a = i10;
        this.f34632b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f34631a) {
            case 0:
                d41 d41Var = this.f34632b;
                e41 e41Var = d41Var.v;
                if (d41Var.f35646a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f34632b.f35651n.f22075b);
                return;
        }
    }
}
