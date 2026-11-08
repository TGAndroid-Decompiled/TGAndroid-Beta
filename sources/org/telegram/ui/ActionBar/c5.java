package org.telegram.ui.ActionBar;
public final class c5 implements te.d, m0 {
    public final e5 f27401a;

    public c5(e5 e5Var) {
        this.f27401a = e5Var;
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
        e5 e5Var = this.f27401a;
        e5Var.e();
        e5Var.f27453a.invalidate();
    }

    @Override
    public void i(int i7) {
        j jVar = this.f27401a.f27453a.V;
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
