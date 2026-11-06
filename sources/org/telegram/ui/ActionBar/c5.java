package org.telegram.ui.ActionBar;
public final class c5 implements te.d, m0 {
    public final e5 f27398a;

    public c5(e5 e5Var) {
        this.f27398a = e5Var;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean B(float f10) {
        return false;
    }

    @Override
    public void Y0() {
        e5 e5Var = this.f27398a;
        e5Var.e();
        e5Var.f27450a.invalidate();
    }

    @Override
    public void i(int i7) {
        j jVar = this.f27398a.f27450a.V;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public void l(boolean z9) {
    }

    @Override
    public void D() {
    }

    @Override
    public void a() {
    }
}
