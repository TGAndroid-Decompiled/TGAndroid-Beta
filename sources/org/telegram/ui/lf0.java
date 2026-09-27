package org.telegram.ui;
public final class lf0 implements org.telegram.ui.ActionBar.b2 {
    public final int f35341a;
    public final wf0 f35342b;

    public lf0(wf0 wf0Var, int i10) {
        this.f35341a = i10;
        this.f35342b = wf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35341a) {
            case 0:
                wf0 wf0Var = this.f35342b;
                wf0Var.c(true);
                wf0Var.f39282s0.u1(0, true, null, true);
                return;
            default:
                this.f35342b.f39282s0.u1(0, true, null, true);
                return;
        }
    }
}
