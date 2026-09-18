package org.telegram.ui.Components;
public final class e7 implements Runnable {
    public final int f23503a;
    public final h8 f23504b;
    public final n70 f23505c;

    public e7(h8 h8Var, n70 n70Var, int i10) {
        this.f23503a = i10;
        this.f23504b = h8Var;
        this.f23505c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f23503a) {
            case 0:
                h8 h8Var = this.f23504b;
                h8Var.getClass();
                this.f23505c.u();
                h8Var.t0(1);
                return;
            case 1:
                h8 h8Var2 = this.f23504b;
                h8Var2.getClass();
                this.f23505c.u();
                h8Var2.t0(2);
                return;
            case 2:
                h8 h8Var3 = this.f23504b;
                h8Var3.getClass();
                this.f23505c.u();
                h8Var3.t0(4);
                return;
            case 3:
                h8 h8Var4 = this.f23504b;
                h8Var4.getClass();
                this.f23505c.u();
                h8Var4.t0(7);
                return;
            default:
                h8.q(this.f23504b, this.f23505c);
                return;
        }
    }
}
