package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class f41 implements Runnable {
    public final int f35459a;
    public final h41 f35460b;

    public f41(h41 h41Var, int i10) {
        this.f35459a = i10;
        this.f35460b = h41Var;
    }

    @Override
    public final void run() {
        switch (this.f35459a) {
            case 0:
                h41 h41Var = this.f35460b;
                i41 i41Var = h41Var.v;
                if (h41Var.f36389a == 0) {
                    i41Var.dismiss();
                    return;
                } else {
                    i41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f35460b.f36393n.f21083b);
                return;
        }
    }
}
