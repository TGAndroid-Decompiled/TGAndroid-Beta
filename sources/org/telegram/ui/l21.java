package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l21 implements Runnable {
    public final int f38728a;
    public final n21 f38729b;

    public l21(n21 n21Var, int i10) {
        this.f38728a = i10;
        this.f38729b = n21Var;
    }

    @Override
    public final void run() {
        switch (this.f38728a) {
            case 0:
                n21 n21Var = this.f38729b;
                o21 o21Var = n21Var.v;
                if (n21Var.f39394a == 0) {
                    o21Var.dismiss();
                    return;
                } else {
                    o21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f38729b.f39398n.f22402b);
                return;
        }
    }
}
