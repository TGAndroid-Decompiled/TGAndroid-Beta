package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l21 implements Runnable {
    public final int f38723a;
    public final n21 f38724b;

    public l21(n21 n21Var, int i10) {
        this.f38723a = i10;
        this.f38724b = n21Var;
    }

    @Override
    public final void run() {
        switch (this.f38723a) {
            case 0:
                n21 n21Var = this.f38724b;
                o21 o21Var = n21Var.v;
                if (n21Var.f39392a == 0) {
                    o21Var.dismiss();
                    return;
                } else {
                    o21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f38724b.f39396n.f22401b);
                return;
        }
    }
}
