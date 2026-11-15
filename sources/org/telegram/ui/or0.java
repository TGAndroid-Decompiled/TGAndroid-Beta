package org.telegram.ui;
public final class or0 implements Runnable {
    public final int f50027a;
    public final xr0 f50028b;

    public or0(xr0 xr0Var, int i7) {
        this.f50027a = i7;
        this.f50028b = xr0Var;
    }

    @Override
    public final void run() {
        switch (this.f50027a) {
            case 0:
                xr0 xr0Var = this.f50028b;
                org.telegram.messenger.g0.h3(new or0(xr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = xr0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = xr0Var.M;
                    q1Var2.f30948d6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = xr0Var.f53302f0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    xr0Var.f53302f0 = null;
                    return;
                }
                return;
            case 1:
                this.f50028b.c(false);
                return;
            case 2:
                this.f50028b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public or0(xr0 xr0Var, boolean z10) {
        this.f50027a = 0;
        this.f50028b = xr0Var;
    }
}
