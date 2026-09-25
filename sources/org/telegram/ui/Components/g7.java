package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f24381a;
    public final j8 f24382b;
    public final y70 f24383c;

    public g7(j8 j8Var, y70 y70Var, int i10) {
        this.f24381a = i10;
        this.f24382b = j8Var;
        this.f24383c = y70Var;
    }

    @Override
    public final void run() {
        switch (this.f24381a) {
            case 0:
                j8 j8Var = this.f24382b;
                j8Var.getClass();
                this.f24383c.u();
                j8Var.t0(1);
                return;
            case 1:
                j8 j8Var2 = this.f24382b;
                j8Var2.getClass();
                this.f24383c.u();
                j8Var2.t0(2);
                return;
            case 2:
                j8 j8Var3 = this.f24382b;
                j8Var3.getClass();
                this.f24383c.u();
                j8Var3.t0(4);
                return;
            case 3:
                j8 j8Var4 = this.f24382b;
                j8Var4.getClass();
                this.f24383c.u();
                j8Var4.t0(7);
                return;
            default:
                j8.q(this.f24382b, this.f24383c);
                return;
        }
    }
}
