package org.telegram.ui.Components;
public final class a7 implements Runnable {
    public final int f26710a;
    public final c8 f26711b;
    public final x60 f26712c;

    public a7(c8 c8Var, x60 x60Var, int i9) {
        this.f26710a = i9;
        this.f26711b = c8Var;
        this.f26712c = x60Var;
    }

    @Override
    public final void run() {
        switch (this.f26710a) {
            case 0:
                c8 c8Var = this.f26711b;
                c8Var.getClass();
                this.f26712c.u();
                c8Var.s0(1);
                return;
            case 1:
                c8 c8Var2 = this.f26711b;
                c8Var2.getClass();
                this.f26712c.u();
                c8Var2.s0(2);
                return;
            case 2:
                c8 c8Var3 = this.f26711b;
                c8Var3.getClass();
                this.f26712c.u();
                c8Var3.s0(4);
                return;
            case 3:
                c8 c8Var4 = this.f26711b;
                c8Var4.getClass();
                this.f26712c.u();
                c8Var4.s0(7);
                return;
            default:
                c8.q(this.f26711b, this.f26712c);
                return;
        }
    }
}
