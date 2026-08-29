package org.telegram.ui;
public final class ie implements Runnable {
    public final int f39214a;
    public final org.telegram.ui.Components.yl0 f39215b;

    public ie(org.telegram.ui.Components.yl0 yl0Var, int i10) {
        this.f39214a = i10;
        this.f39215b = yl0Var;
    }

    @Override
    public final void run() {
        switch (this.f39214a) {
            case 0:
                org.telegram.ui.Components.yl0 yl0Var = this.f39215b;
                if (!yl0Var.I) {
                    yl0Var.I = true;
                    yl0Var.c(new org.telegram.ui.Components.wl0(yl0Var, 0), false);
                    yl0Var.f35097s.invalidate();
                    return;
                }
                return;
            default:
                this.f39215b.dismiss();
                return;
        }
    }
}
