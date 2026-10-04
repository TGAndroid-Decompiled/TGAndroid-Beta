package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f26688a;
    public final j8 f26689b;
    public final b80 f26690c;

    public g7(j8 j8Var, b80 b80Var, int i10) {
        this.f26688a = i10;
        this.f26689b = j8Var;
        this.f26690c = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f26688a) {
            case 0:
                j8 j8Var = this.f26689b;
                j8Var.getClass();
                this.f26690c.u();
                j8Var.t0(1);
                return;
            case 1:
                j8 j8Var2 = this.f26689b;
                j8Var2.getClass();
                this.f26690c.u();
                j8Var2.t0(2);
                return;
            case 2:
                j8 j8Var3 = this.f26689b;
                j8Var3.getClass();
                this.f26690c.u();
                j8Var3.t0(4);
                return;
            case 3:
                j8 j8Var4 = this.f26689b;
                j8Var4.getClass();
                this.f26690c.u();
                j8Var4.t0(7);
                return;
            default:
                j8.q(this.f26689b, this.f26690c);
                return;
        }
    }
}
