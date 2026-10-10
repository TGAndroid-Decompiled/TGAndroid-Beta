package org.telegram.ui.Wallet;

import android.view.View;
public final class a3 implements Runnable {
    public final int f34664a;
    public final e3 f34665b;

    public a3(e3 e3Var, int i10) {
        this.f34664a = i10;
        this.f34665b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f34664a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34665b.f34864a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34665b.p();
                return;
        }
    }
}
