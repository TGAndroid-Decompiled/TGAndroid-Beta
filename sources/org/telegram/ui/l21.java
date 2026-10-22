package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l21 implements Runnable {
    public final int f38731a;
    public final n21 f38732b;

    public l21(n21 n21Var, int i10) {
        this.f38731a = i10;
        this.f38732b = n21Var;
    }

    @Override
    public final void run() {
        switch (this.f38731a) {
            case 0:
                n21 n21Var = this.f38732b;
                o21 o21Var = n21Var.v;
                if (n21Var.f39397a == 0) {
                    o21Var.dismiss();
                    return;
                } else {
                    o21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f38732b.f39401n.f22405b);
                return;
        }
    }
}
