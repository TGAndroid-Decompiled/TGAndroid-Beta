package org.telegram.ui;
public final class jx0 implements Runnable {
    public final int f49230a;
    public final lx0 f49231b;
    public final int f49232c;

    public jx0(lx0 lx0Var, int i7, int i10) {
        this.f49230a = i10;
        this.f49231b = lx0Var;
        this.f49232c = i7;
    }

    @Override
    public final void run() {
        switch (this.f49230a) {
            case 0:
                lx0 lx0Var = this.f49231b;
                org.telegram.ui.Components.j71 j71Var = lx0Var.f49870b;
                kx0 kx0Var = lx0Var.d;
                int i7 = this.f49232c;
                j71Var.e(i7, kx0Var.i(i7));
                return;
            default:
                lx0 lx0Var2 = this.f49231b;
                org.telegram.ui.Components.j71 j71Var2 = lx0Var2.f49870b;
                kx0 kx0Var2 = lx0Var2.d;
                int i10 = this.f49232c;
                j71Var2.e(i10, kx0Var2.i(i10));
                return;
        }
    }
}
