package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l21 implements Runnable {
    public final int f38721a;
    public final n21 f38722b;

    public l21(n21 n21Var, int i10) {
        this.f38721a = i10;
        this.f38722b = n21Var;
    }

    @Override
    public final void run() {
        switch (this.f38721a) {
            case 0:
                n21 n21Var = this.f38722b;
                o21 o21Var = n21Var.v;
                if (n21Var.f39388a == 0) {
                    o21Var.dismiss();
                    return;
                } else {
                    o21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f38722b.f39392n.f22399b);
                return;
        }
    }
}
