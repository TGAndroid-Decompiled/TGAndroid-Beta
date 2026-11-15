package org.telegram.ui;
public final class or0 implements Runnable {
    public final int f50050a;
    public final xr0 f50051b;

    public or0(xr0 xr0Var, int i7) {
        this.f50050a = i7;
        this.f50051b = xr0Var;
    }

    @Override
    public final void run() {
        switch (this.f50050a) {
            case 0:
                xr0 xr0Var = this.f50051b;
                org.telegram.messenger.g0.h3(new or0(xr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = xr0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = xr0Var.M;
                    q1Var2.f30948d6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = xr0Var.f53298f0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    xr0Var.f53298f0 = null;
                    return;
                }
                return;
            case 1:
                this.f50051b.c(false);
                return;
            case 2:
                this.f50051b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public or0(xr0 xr0Var, boolean z10) {
        this.f50050a = 0;
        this.f50051b = xr0Var;
    }
}
