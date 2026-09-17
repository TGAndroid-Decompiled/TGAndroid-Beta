package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f34658a;
    public final d41 f34659b;

    public b41(d41 d41Var, int i10) {
        this.f34658a = i10;
        this.f34659b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f34658a) {
            case 0:
                d41 d41Var = this.f34659b;
                e41 e41Var = d41Var.v;
                if (d41Var.f35673a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f34659b.f35678n.f22102b);
                return;
        }
    }
}
