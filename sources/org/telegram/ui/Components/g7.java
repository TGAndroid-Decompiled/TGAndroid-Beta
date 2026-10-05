package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f26709a;
    public final j8 f26710b;
    public final b80 f26711c;

    public g7(j8 j8Var, b80 b80Var, int i10) {
        this.f26709a = i10;
        this.f26710b = j8Var;
        this.f26711c = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f26709a) {
            case 0:
                j8 j8Var = this.f26710b;
                j8Var.getClass();
                this.f26711c.u();
                j8Var.t0(1);
                return;
            case 1:
                j8 j8Var2 = this.f26710b;
                j8Var2.getClass();
                this.f26711c.u();
                j8Var2.t0(2);
                return;
            case 2:
                j8 j8Var3 = this.f26710b;
                j8Var3.getClass();
                this.f26711c.u();
                j8Var3.t0(4);
                return;
            case 3:
                j8 j8Var4 = this.f26710b;
                j8Var4.getClass();
                this.f26711c.u();
                j8Var4.t0(7);
                return;
            default:
                j8.q(this.f26710b, this.f26711c);
                return;
        }
    }
}
