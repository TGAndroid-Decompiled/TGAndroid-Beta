package org.telegram.ui.Components;
public final class b7 implements Runnable {
    public final int f23571a;
    public final c8 f23572b;
    public final p70 f23573c;

    public b7(c8 c8Var, p70 p70Var, int i10) {
        this.f23571a = i10;
        this.f23572b = c8Var;
        this.f23573c = p70Var;
    }

    @Override
    public final void run() {
        switch (this.f23571a) {
            case 0:
                c8 c8Var = this.f23572b;
                c8Var.getClass();
                this.f23573c.u();
                c8Var.t0(1);
                return;
            case 1:
                c8 c8Var2 = this.f23572b;
                c8Var2.getClass();
                this.f23573c.u();
                c8Var2.t0(2);
                return;
            case 2:
                c8 c8Var3 = this.f23572b;
                c8Var3.getClass();
                this.f23573c.u();
                c8Var3.t0(4);
                return;
            case 3:
                c8 c8Var4 = this.f23572b;
                c8Var4.getClass();
                this.f23573c.u();
                c8Var4.t0(7);
                return;
            default:
                c8.q(this.f23572b, this.f23573c);
                return;
        }
    }
}
