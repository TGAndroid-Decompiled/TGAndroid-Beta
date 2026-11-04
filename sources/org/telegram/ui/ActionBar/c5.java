package org.telegram.ui.ActionBar;
public final class c5 implements qe.d, l0 {
    public final e5 f27450a;

    public c5(e5 e5Var) {
        this.f27450a = e5Var;
    }

    @Override
    public void i(int i3) {
        j jVar = this.f27450a.f27477a.W;
        if (jVar != null) {
            jVar.b(i3);
        }
    }

    @Override
    public void s1() {
        e5 e5Var = this.f27450a;
        e5Var.e();
        e5Var.f27477a.invalidate();
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public boolean x(float f10) {
        return false;
    }

    @Override
    public void o(boolean z10) {
    }

    @Override
    public void G() {
    }

    @Override
    public void a() {
    }
}
