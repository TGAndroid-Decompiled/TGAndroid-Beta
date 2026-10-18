package org.telegram.ui.Wallet;

import android.view.View;
public final class h3 implements Runnable {
    public final int f34297a;
    public final l3 f34298b;

    public h3(l3 l3Var, int i10) {
        this.f34297a = i10;
        this.f34298b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f34297a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34298b.f34446a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34298b.s();
                return;
        }
    }
}
