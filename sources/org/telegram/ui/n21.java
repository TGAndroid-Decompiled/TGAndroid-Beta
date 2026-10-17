package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n21 implements Runnable {
    public final int f39298a;
    public final p21 f39299b;

    public n21(p21 p21Var, int i10) {
        this.f39298a = i10;
        this.f39299b = p21Var;
    }

    @Override
    public final void run() {
        switch (this.f39298a) {
            case 0:
                p21 p21Var = this.f39299b;
                q21 q21Var = p21Var.v;
                if (p21Var.f39941a == 0) {
                    q21Var.dismiss();
                    return;
                } else {
                    q21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39299b.f39945n.f22401b);
                return;
        }
    }
}
