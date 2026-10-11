package org.telegram.ui.Wallet;

import android.view.View;
public final class b3 implements Runnable {
    public final int f34726a;
    public final f3 f34727b;

    public b3(f3 f3Var, int i10) {
        this.f34726a = i10;
        this.f34727b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f34726a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34727b.f34930a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34727b.p();
                return;
        }
    }
}
