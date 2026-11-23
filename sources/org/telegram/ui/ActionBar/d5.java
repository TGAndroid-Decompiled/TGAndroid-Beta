package org.telegram.ui.ActionBar;
public final class d5 implements te.d, l0 {
    public final f5 f28882a;

    public d5(f5 f5Var) {
        this.f28882a = f5Var;
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
        j jVar = this.f28882a.f28958a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public void m1() {
        f5 f5Var = this.f28882a;
        f5Var.e();
        f5Var.f28958a.invalidate();
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
