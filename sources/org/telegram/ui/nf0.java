package org.telegram.ui;
public final class nf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40198a;
    public final zf0 f40199b;

    public nf0(zf0 zf0Var, int i10) {
        this.f40198a = i10;
        this.f40199b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40198a) {
            case 0:
                zf0 zf0Var = this.f40199b;
                zf0Var.c(true);
                zf0Var.f44612s0.u1(0, true, null, true);
                return;
            default:
                this.f40199b.f44612s0.u1(0, true, null, true);
                return;
        }
    }
}
