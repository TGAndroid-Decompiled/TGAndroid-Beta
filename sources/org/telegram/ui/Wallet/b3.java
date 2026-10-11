package org.telegram.ui.Wallet;

import android.view.View;
public final class b3 implements Runnable {
    public final int f34692a;
    public final f3 f34693b;

    public b3(f3 f3Var, int i10) {
        this.f34692a = i10;
        this.f34693b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f34692a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34693b.f34896a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34693b.p();
                return;
        }
    }
}
