package org.telegram.ui.ActionBar;
public final class m5 implements fe.g, o0 {
    public final o5 f20588a;

    public m5(o5 o5Var) {
        this.f20588a = o5Var;
    }

    @Override
    public void k(int i10) {
        k kVar = this.f20588a.f20626a.V;
        if (kVar != null) {
            kVar.b(i10);
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m(float f7) {
        return false;
    }

    @Override
    public void z() {
        o5 o5Var = this.f20588a;
        o5Var.e();
        o5Var.f20626a.invalidate();
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void a() {
    }

    @Override
    public void n() {
    }
}
