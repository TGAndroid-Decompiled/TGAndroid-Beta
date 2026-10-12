package org.telegram.ui.Components;
public final class i7 implements Runnable {
    public final int f27078a;
    public final l8 f27079b;
    public final s80 f27080c;

    public i7(l8 l8Var, s80 s80Var, int i10) {
        this.f27078a = i10;
        this.f27079b = l8Var;
        this.f27080c = s80Var;
    }

    @Override
    public final void run() {
        switch (this.f27078a) {
            case 0:
                l8 l8Var = this.f27079b;
                l8Var.getClass();
                this.f27080c.u();
                l8Var.u0(1);
                return;
            case 1:
                l8 l8Var2 = this.f27079b;
                l8Var2.getClass();
                this.f27080c.u();
                l8Var2.u0(2);
                return;
            case 2:
                l8 l8Var3 = this.f27079b;
                l8Var3.getClass();
                this.f27080c.u();
                l8Var3.u0(4);
                return;
            case 3:
                l8 l8Var4 = this.f27079b;
                l8Var4.getClass();
                this.f27080c.u();
                l8Var4.u0(7);
                return;
            default:
                l8.s(this.f27079b, this.f27080c);
                return;
        }
    }
}
