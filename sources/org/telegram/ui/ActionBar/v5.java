package org.telegram.ui.ActionBar;
public final class v5 implements oe.f, r0 {
    public final x5 f23161a;

    public v5(x5 x5Var) {
        this.f23161a = x5Var;
    }

    @Override
    public void P() {
        x5 x5Var = this.f23161a;
        x5Var.d();
        x5Var.f23248a.invalidate();
    }

    @Override
    public void g(int i10) {
        j jVar = this.f23161a.f23248a.T;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void a() {
    }

    @Override
    public void l() {
    }

    @Override
    public void i(boolean z10) {
    }
}
