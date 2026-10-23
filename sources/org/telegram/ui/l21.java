package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l21 implements Runnable {
    public final int f38732a;
    public final n21 f38733b;

    public l21(n21 n21Var, int i10) {
        this.f38732a = i10;
        this.f38733b = n21Var;
    }

    @Override
    public final void run() {
        switch (this.f38732a) {
            case 0:
                n21 n21Var = this.f38733b;
                o21 o21Var = n21Var.v;
                if (n21Var.f39398a == 0) {
                    o21Var.dismiss();
                    return;
                } else {
                    o21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f38733b.f39402n.f22406b);
                return;
        }
    }
}
