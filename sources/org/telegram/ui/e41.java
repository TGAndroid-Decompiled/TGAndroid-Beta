package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class e41 implements Runnable {
    public final int f32060a;
    public final g41 f32061b;

    public e41(g41 g41Var, int i10) {
        this.f32060a = i10;
        this.f32061b = g41Var;
    }

    @Override
    public final void run() {
        switch (this.f32060a) {
            case 0:
                g41 g41Var = this.f32061b;
                h41 h41Var = g41Var.v;
                if (g41Var.f32988a == 0) {
                    h41Var.dismiss();
                    return;
                } else {
                    h41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f32061b.f32992n.f19293b);
                return;
        }
    }
}
