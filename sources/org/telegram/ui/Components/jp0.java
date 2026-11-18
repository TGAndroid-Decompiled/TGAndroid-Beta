package org.telegram.ui.Components;
public final class jp0 implements Runnable {
    public final int f36512a;
    public final gt0 f36513b;
    public final int f36514c;

    public jp0(gt0 gt0Var, int i7, int i10) {
        this.f36512a = i10;
        this.f36513b = gt0Var;
        this.f36514c = i7;
    }

    @Override
    public final void run() {
        switch (this.f36512a) {
            case 0:
                this.f36513b.s1(this.f36514c);
                return;
            case 1:
                gt0 gt0Var = this.f36513b;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                gt0Var.a1(this.f36514c, gt0Var.f35606m1, h2Var);
                return;
            case 2:
                this.f36513b.r1(this.f36514c, false);
                return;
            case 3:
                this.f36513b.s1(this.f36514c);
                return;
            default:
                gt0 gt0Var2 = this.f36513b;
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                gt0Var2.b1(this.f36514c, gt0Var2.f35606m1, h2Var2);
                return;
        }
    }
}
