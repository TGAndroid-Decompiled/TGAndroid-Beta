package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class f41 implements Runnable {
    public final int f35737a;
    public final h41 f35738b;

    public f41(h41 h41Var, int i10) {
        this.f35737a = i10;
        this.f35738b = h41Var;
    }

    @Override
    public final void run() {
        switch (this.f35737a) {
            case 0:
                h41 h41Var = this.f35738b;
                i41 i41Var = h41Var.v;
                if (h41Var.f36599a == 0) {
                    i41Var.dismiss();
                    return;
                } else {
                    i41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f35738b.f36603n.f21368b);
                return;
        }
    }
}
