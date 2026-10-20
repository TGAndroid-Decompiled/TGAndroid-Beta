package org.telegram.ui.Wallet;

import android.view.View;
public final class j3 implements Runnable {
    public final int f34379a;
    public final n3 f34380b;

    public j3(n3 n3Var, int i10) {
        this.f34379a = i10;
        this.f34380b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f34379a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34380b.f34554a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34380b.p();
                return;
        }
    }
}
