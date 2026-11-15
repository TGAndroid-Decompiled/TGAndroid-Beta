package org.telegram.ui.ActionBar;
public final class a5 implements te.d, l0 {
    public final c5 f28407a;

    public a5(c5 c5Var) {
        this.f28407a = c5Var;
    }

    @Override
    public void b0() {
        c5 c5Var = this.f28407a;
        c5Var.e();
        c5Var.f28492a.invalidate();
    }

    @Override
    public void g(int i7) {
        j jVar = this.f28407a.f28492a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean s(float f10) {
        return false;
    }

    @Override
    public void n(boolean z10) {
    }

    @Override
    public void a() {
    }

    @Override
    public void v() {
    }
}
