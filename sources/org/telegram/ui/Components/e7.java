package org.telegram.ui.Components;
public final class e7 implements Runnable {
    public final int f23500a;
    public final h8 f23501b;
    public final n70 f23502c;

    public e7(h8 h8Var, n70 n70Var, int i10) {
        this.f23500a = i10;
        this.f23501b = h8Var;
        this.f23502c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f23500a) {
            case 0:
                h8 h8Var = this.f23501b;
                h8Var.getClass();
                this.f23502c.u();
                h8Var.t0(1);
                return;
            case 1:
                h8 h8Var2 = this.f23501b;
                h8Var2.getClass();
                this.f23502c.u();
                h8Var2.t0(2);
                return;
            case 2:
                h8 h8Var3 = this.f23501b;
                h8Var3.getClass();
                this.f23502c.u();
                h8Var3.t0(4);
                return;
            case 3:
                h8 h8Var4 = this.f23501b;
                h8Var4.getClass();
                this.f23502c.u();
                h8Var4.t0(7);
                return;
            default:
                h8.q(this.f23501b, this.f23502c);
                return;
        }
    }
}
