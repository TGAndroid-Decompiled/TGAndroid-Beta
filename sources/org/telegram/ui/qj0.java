package org.telegram.ui;
public final class qj0 implements Runnable {
    public final int f42859a;
    public final xj0 f42860b;

    public qj0(xj0 xj0Var, int i10) {
        this.f42859a = i10;
        this.f42860b = xj0Var;
    }

    @Override
    public final void run() {
        rh.e eVar;
        xj0 xj0Var;
        int i10;
        switch (this.f42859a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null) {
                    eVar = launchActivity.f35535h1;
                } else {
                    eVar = null;
                }
                if ((eVar == null || eVar.f47613c <= 0) && xj0Var.J != (i10 = (xj0Var = this.f42860b).K)) {
                    xj0Var.J = i10;
                    xj0Var.p0(false);
                    return;
                }
                return;
            case 1:
                this.f42860b.f45789y.setVisibility(8);
                return;
            default:
                xj0 xj0Var2 = this.f42860b;
                xj0Var2.O = null;
                xj0Var2.l0(2, true);
                return;
        }
    }
}
