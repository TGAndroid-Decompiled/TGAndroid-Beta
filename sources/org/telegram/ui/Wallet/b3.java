package org.telegram.ui.Wallet;

import android.view.View;
public final class b3 implements Runnable {
    public final int f34501a;
    public final f3 f34502b;

    public b3(f3 f3Var, int i10) {
        this.f34501a = i10;
        this.f34502b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f34501a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34502b.f34705a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34502b.p();
                return;
        }
    }
}
