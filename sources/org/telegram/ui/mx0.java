package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f48024a;
    public final ox0 f48025b;
    public final int f48026c;

    public mx0(ox0 ox0Var, int i7, int i10) {
        this.f48024a = i10;
        this.f48025b = ox0Var;
        this.f48026c = i7;
    }

    @Override
    public final void run() {
        switch (this.f48024a) {
            case 0:
                ox0 ox0Var = this.f48025b;
                org.telegram.ui.Components.v61 v61Var = ox0Var.f48546b;
                nx0 nx0Var = ox0Var.d;
                int i7 = this.f48026c;
                v61Var.d(i7, nx0Var.i(i7));
                return;
            default:
                ox0 ox0Var2 = this.f48025b;
                org.telegram.ui.Components.v61 v61Var2 = ox0Var2.f48546b;
                nx0 nx0Var2 = ox0Var2.d;
                int i10 = this.f48026c;
                v61Var2.d(i10, nx0Var2.i(i10));
                return;
        }
    }
}
