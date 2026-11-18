package org.telegram.ui.ActionBar;
public final class e5 implements te.d, m0 {
    public final g5 f28896a;

    public e5(g5 g5Var) {
        this.f28896a = g5Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean D(float f10) {
        return false;
    }

    @Override
    public void g(int i7) {
        j jVar = this.f28896a.f28973a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public void m1() {
        g5 g5Var = this.f28896a;
        g5Var.e();
        g5Var.f28973a.invalidate();
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void H() {
    }

    @Override
    public void a() {
    }
}
