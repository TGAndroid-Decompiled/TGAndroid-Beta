package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class o21 implements Runnable {
    public final int f40064a;
    public final q21 f40065b;

    public o21(q21 q21Var, int i10) {
        this.f40064a = i10;
        this.f40065b = q21Var;
    }

    @Override
    public final void run() {
        switch (this.f40064a) {
            case 0:
                q21 q21Var = this.f40065b;
                r21 r21Var = q21Var.v;
                if (q21Var.f40693a == 0) {
                    r21Var.dismiss();
                    return;
                } else {
                    r21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40065b.f40697n.d);
                return;
        }
    }
}
