package org.telegram.ui.Wallet;

import android.view.View;
public final class j4 implements Runnable {
    public final int f44526a;
    public final n4 f44527b;

    public j4(n4 n4Var, int i7) {
        this.f44526a = i7;
        this.f44527b = n4Var;
    }

    @Override
    public final void run() {
        switch (this.f44526a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f44527b.f44695a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f44527b.p();
                return;
        }
    }
}
