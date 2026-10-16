package org.telegram.ui;
public final class pg0 implements Runnable {
    public final int f38920a;
    public final zg0 f38921b;

    public pg0(zg0 zg0Var, int i10) {
        this.f38920a = i10;
        this.f38921b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f38920a) {
            case 0:
                zg0 zg0Var = this.f38921b;
                fk0 fk0Var = zg0Var.f42309a;
                ah0 ah0Var = zg0Var.V;
                wg0 wg0Var = zg0Var.f42310b;
                if (wg0Var != null) {
                    if (ah0Var.f33910c0) {
                        fk0Var.clearFocus();
                        wg0Var.clearFocus();
                    } else if (fk0Var.length() != 0) {
                        wg0Var.requestFocus();
                        if (!zg0Var.R) {
                            wg0Var.setSelection(wg0Var.length());
                        }
                        ah0.T0(ah0Var, wg0Var);
                    } else {
                        fk0Var.requestFocus();
                        ah0.T0(ah0Var, fk0Var);
                    }
                }
                if (ah0Var.F == 0) {
                    zg0Var.s(false);
                    return;
                }
                return;
            case 1:
                zg0 zg0Var2 = this.f38921b;
                zg0Var2.postDelayed(new pg0(zg0Var2, 2), 200L);
                return;
            case 2:
                this.f38921b.h(null);
                return;
            case 3:
                this.f38921b.s(true);
                return;
            default:
                zg0 zg0Var3 = this.f38921b;
                ah0.T0(zg0Var3.V, zg0Var3.f42310b);
                return;
        }
    }
}
