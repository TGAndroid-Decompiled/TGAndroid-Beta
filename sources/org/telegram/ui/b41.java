package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b41 implements Runnable {
    public final int f36068a;
    public final d41 f36069b;

    public b41(d41 d41Var, int i10) {
        this.f36068a = i10;
        this.f36069b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f36068a) {
            case 0:
                d41 d41Var = this.f36069b;
                e41 e41Var = d41Var.v;
                if (d41Var.f36640a == 0) {
                    e41Var.dismiss();
                    return;
                } else {
                    e41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36069b.f36645n.f22081b);
                return;
        }
    }
}
