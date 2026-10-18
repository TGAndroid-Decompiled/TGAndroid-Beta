package org.telegram.ui.Wallet;

import android.view.View;
public final class i3 implements Runnable {
    public final int f34299a;
    public final m3 f34300b;

    public i3(m3 m3Var, int i10) {
        this.f34299a = i10;
        this.f34300b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f34299a) {
            case 0:
                org.telegram.ui.Cells.w0 w0Var = this.f34300b.f34482a;
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f34300b.s();
                return;
        }
    }
}
