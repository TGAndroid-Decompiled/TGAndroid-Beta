package org.telegram.ui.ActionBar;
public final class d5 implements te.d, m0 {
    public final f5 f27419a;

    public d5(f5 f5Var) {
        this.f27419a = f5Var;
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
        f5 f5Var = this.f27419a;
        f5Var.e();
        f5Var.f27473a.invalidate();
    }

    @Override
    public void i(int i7) {
        k kVar = this.f27419a.f27473a.V;
        if (kVar != null) {
            kVar.b(i7);
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
