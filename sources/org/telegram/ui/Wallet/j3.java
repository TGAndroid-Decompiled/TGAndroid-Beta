package org.telegram.ui.Wallet;

import android.view.View;
public final class j3 implements Runnable {
    public final int f34383a;
    public final n3 f34384b;

    public j3(n3 n3Var, int i10) {
        this.f34383a = i10;
        this.f34384b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f34383a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34384b.f34558a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34384b.p();
                return;
        }
    }
}
