package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f24320a;
    public final j8 f24321b;
    public final w70 f24322c;

    public g7(j8 j8Var, w70 w70Var, int i10) {
        this.f24320a = i10;
        this.f24321b = j8Var;
        this.f24322c = w70Var;
    }

    @Override
    public final void run() {
        switch (this.f24320a) {
            case 0:
                j8 j8Var = this.f24321b;
                j8Var.getClass();
                this.f24322c.u();
                j8Var.t0(1);
                return;
            case 1:
                j8 j8Var2 = this.f24321b;
                j8Var2.getClass();
                this.f24322c.u();
                j8Var2.t0(2);
                return;
            case 2:
                j8 j8Var3 = this.f24321b;
                j8Var3.getClass();
                this.f24322c.u();
                j8Var3.t0(4);
                return;
            case 3:
                j8 j8Var4 = this.f24321b;
                j8Var4.getClass();
                this.f24322c.u();
                j8Var4.t0(7);
                return;
            default:
                j8.q(this.f24321b, this.f24322c);
                return;
        }
    }
}
