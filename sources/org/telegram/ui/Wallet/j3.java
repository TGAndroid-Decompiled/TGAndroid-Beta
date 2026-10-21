package org.telegram.ui.Wallet;

import android.view.View;
public final class j3 implements Runnable {
    public final int f34380a;
    public final n3 f34381b;

    public j3(n3 n3Var, int i10) {
        this.f34380a = i10;
        this.f34381b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f34380a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34381b.f34555a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34381b.p();
                return;
        }
    }
}
