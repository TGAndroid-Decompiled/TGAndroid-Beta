package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40702a;
    public final zf0 f40703b;

    public of0(zf0 zf0Var, int i10) {
        this.f40702a = i10;
        this.f40703b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40702a) {
            case 0:
                zf0 zf0Var = this.f40703b;
                zf0Var.c(true);
                zf0Var.f44833s0.u1(0, true, null, true);
                return;
            default:
                this.f40703b.f44833s0.u1(0, true, null, true);
                return;
        }
    }
}
