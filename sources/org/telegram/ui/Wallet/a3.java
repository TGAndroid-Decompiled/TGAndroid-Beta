package org.telegram.ui.Wallet;

import android.view.View;
public final class a3 implements Runnable {
    public final int f32632a;
    public final e3 f32633b;

    public a3(e3 e3Var, int i10) {
        this.f32632a = i10;
        this.f32633b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f32632a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f32633b.f32822a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f32633b.p();
                return;
        }
    }
}
