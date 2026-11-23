package org.telegram.ui.ActionBar;
public final class d5 implements te.d, l0 {
    public final f5 f28933a;

    public d5(f5 f5Var) {
        this.f28933a = f5Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean H(float f10) {
        return false;
    }

    @Override
    public void h(int i7) {
        j jVar = this.f28933a.f29016a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public void y1() {
        f5 f5Var = this.f28933a;
        f5Var.e();
        f5Var.f29016a.invalidate();
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void K() {
    }

    @Override
    public void a() {
    }
}
