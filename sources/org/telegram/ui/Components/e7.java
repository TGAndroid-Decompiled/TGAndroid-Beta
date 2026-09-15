package org.telegram.ui.Components;
public final class e7 implements Runnable {
    public final int f23563a;
    public final h8 f23564b;
    public final n70 f23565c;

    public e7(h8 h8Var, n70 n70Var, int i10) {
        this.f23563a = i10;
        this.f23564b = h8Var;
        this.f23565c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f23563a) {
            case 0:
                h8 h8Var = this.f23564b;
                h8Var.getClass();
                this.f23565c.u();
                h8Var.t0(1);
                return;
            case 1:
                h8 h8Var2 = this.f23564b;
                h8Var2.getClass();
                this.f23565c.u();
                h8Var2.t0(2);
                return;
            case 2:
                h8 h8Var3 = this.f23564b;
                h8Var3.getClass();
                this.f23565c.u();
                h8Var3.t0(4);
                return;
            case 3:
                h8 h8Var4 = this.f23564b;
                h8Var4.getClass();
                this.f23565c.u();
                h8Var4.t0(7);
                return;
            default:
                h8.q(this.f23564b, this.f23565c);
                return;
        }
    }
}
