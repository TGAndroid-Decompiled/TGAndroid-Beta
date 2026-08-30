package org.telegram.ui.Components;
public final class b7 implements Runnable {
    public final int f23583a;
    public final c8 f23584b;
    public final o70 f23585c;

    public b7(c8 c8Var, o70 o70Var, int i10) {
        this.f23583a = i10;
        this.f23584b = c8Var;
        this.f23585c = o70Var;
    }

    @Override
    public final void run() {
        switch (this.f23583a) {
            case 0:
                c8 c8Var = this.f23584b;
                c8Var.getClass();
                this.f23585c.u();
                c8Var.t0(1);
                return;
            case 1:
                c8 c8Var2 = this.f23584b;
                c8Var2.getClass();
                this.f23585c.u();
                c8Var2.t0(2);
                return;
            case 2:
                c8 c8Var3 = this.f23584b;
                c8Var3.getClass();
                this.f23585c.u();
                c8Var3.t0(4);
                return;
            case 3:
                c8 c8Var4 = this.f23584b;
                c8Var4.getClass();
                this.f23585c.u();
                c8Var4.t0(7);
                return;
            default:
                c8.q(this.f23584b, this.f23585c);
                return;
        }
    }
}
