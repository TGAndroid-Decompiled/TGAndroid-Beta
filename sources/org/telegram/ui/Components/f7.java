package org.telegram.ui.Components;
public final class f7 implements Runnable {
    public final int f22913a;
    public final j8 f22914b;
    public final w70 f22915c;

    public f7(j8 j8Var, w70 w70Var, int i10) {
        this.f22913a = i10;
        this.f22914b = j8Var;
        this.f22915c = w70Var;
    }

    @Override
    public final void run() {
        switch (this.f22913a) {
            case 0:
                j8 j8Var = this.f22914b;
                j8Var.getClass();
                this.f22915c.u();
                j8Var.t0(1);
                return;
            case 1:
                j8 j8Var2 = this.f22914b;
                j8Var2.getClass();
                this.f22915c.u();
                j8Var2.t0(2);
                return;
            case 2:
                j8 j8Var3 = this.f22914b;
                j8Var3.getClass();
                this.f22915c.u();
                j8Var3.t0(4);
                return;
            case 3:
                j8 j8Var4 = this.f22914b;
                j8Var4.getClass();
                this.f22915c.u();
                j8Var4.t0(7);
                return;
            default:
                j8.q(this.f22914b, this.f22915c);
                return;
        }
    }
}
