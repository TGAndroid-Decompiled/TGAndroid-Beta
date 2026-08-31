package org.telegram.ui.Components;
public final class b7 implements Runnable {
    public final int f25505a;
    public final c8 f25506b;
    public final q70 f25507c;

    public b7(c8 c8Var, q70 q70Var, int i10) {
        this.f25505a = i10;
        this.f25506b = c8Var;
        this.f25507c = q70Var;
    }

    @Override
    public final void run() {
        switch (this.f25505a) {
            case 0:
                c8 c8Var = this.f25506b;
                c8Var.getClass();
                this.f25507c.u();
                c8Var.t0(1);
                return;
            case 1:
                c8 c8Var2 = this.f25506b;
                c8Var2.getClass();
                this.f25507c.u();
                c8Var2.t0(2);
                return;
            case 2:
                c8 c8Var3 = this.f25506b;
                c8Var3.getClass();
                this.f25507c.u();
                c8Var3.t0(4);
                return;
            case 3:
                c8 c8Var4 = this.f25506b;
                c8Var4.getClass();
                this.f25507c.u();
                c8Var4.t0(7);
                return;
            default:
                c8.q(this.f25506b, this.f25507c);
                return;
        }
    }
}
