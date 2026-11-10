package org.telegram.ui;
public final class nx0 implements Runnable {
    public final int f48321a;
    public final px0 f48322b;
    public final int f48323c;

    public nx0(px0 px0Var, int i7, int i10) {
        this.f48321a = i10;
        this.f48322b = px0Var;
        this.f48323c = i7;
    }

    @Override
    public final void run() {
        switch (this.f48321a) {
            case 0:
                px0 px0Var = this.f48322b;
                org.telegram.ui.Components.u61 u61Var = px0Var.f48862b;
                ox0 ox0Var = px0Var.d;
                int i7 = this.f48323c;
                u61Var.d(i7, ox0Var.i(i7));
                return;
            default:
                px0 px0Var2 = this.f48322b;
                org.telegram.ui.Components.u61 u61Var2 = px0Var2.f48862b;
                ox0 ox0Var2 = px0Var2.d;
                int i10 = this.f48323c;
                u61Var2.d(i10, ox0Var2.i(i10));
                return;
        }
    }
}
