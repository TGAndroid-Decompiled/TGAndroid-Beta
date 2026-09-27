package org.telegram.ui;
public final class ig0 implements Runnable {
    public final int f34477a;
    public final sg0 f34478b;

    public ig0(sg0 sg0Var, int i10) {
        this.f34477a = i10;
        this.f34478b = sg0Var;
    }

    @Override
    public final void run() {
        switch (this.f34477a) {
            case 0:
                sg0 sg0Var = this.f34478b;
                wj0 wj0Var = sg0Var.f37448a;
                tg0 tg0Var = sg0Var.V;
                pg0 pg0Var = sg0Var.f37449b;
                if (pg0Var != null) {
                    if (tg0Var.f37789c0) {
                        wj0Var.clearFocus();
                        pg0Var.clearFocus();
                    } else if (wj0Var.length() != 0) {
                        pg0Var.requestFocus();
                        if (!sg0Var.R) {
                            pg0Var.setSelection(pg0Var.length());
                        }
                        tg0.T0(tg0Var, pg0Var);
                    } else {
                        wj0Var.requestFocus();
                        tg0.T0(tg0Var, wj0Var);
                    }
                }
                if (tg0Var.F == 0) {
                    sg0Var.u(false);
                    return;
                }
                return;
            case 1:
                sg0 sg0Var2 = this.f34478b;
                sg0Var2.postDelayed(new ig0(sg0Var2, 2), 200L);
                return;
            case 2:
                this.f34478b.h(null);
                return;
            case 3:
                this.f34478b.u(true);
                return;
            default:
                sg0 sg0Var3 = this.f34478b;
                tg0.T0(sg0Var3.V, sg0Var3.f37449b);
                return;
        }
    }
}
