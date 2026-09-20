package org.telegram.ui.Components;
public final class f7 implements Runnable {
    public final int f24015a;
    public final i8 f24016b;
    public final v70 f24017c;

    public f7(i8 i8Var, v70 v70Var, int i10) {
        this.f24015a = i10;
        this.f24016b = i8Var;
        this.f24017c = v70Var;
    }

    @Override
    public final void run() {
        switch (this.f24015a) {
            case 0:
                i8 i8Var = this.f24016b;
                i8Var.getClass();
                this.f24017c.u();
                i8Var.t0(1);
                return;
            case 1:
                i8 i8Var2 = this.f24016b;
                i8Var2.getClass();
                this.f24017c.u();
                i8Var2.t0(2);
                return;
            case 2:
                i8 i8Var3 = this.f24016b;
                i8Var3.getClass();
                this.f24017c.u();
                i8Var3.t0(4);
                return;
            case 3:
                i8 i8Var4 = this.f24016b;
                i8Var4.getClass();
                this.f24017c.u();
                i8Var4.t0(7);
                return;
            default:
                i8.q(this.f24016b, this.f24017c);
                return;
        }
    }
}
