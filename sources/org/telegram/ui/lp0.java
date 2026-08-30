package org.telegram.ui;

import android.text.Editable;
public final class lp0 implements eq0 {
    public final pp0 f36121a;

    public lp0(pp0 pp0Var) {
        this.f36121a = pp0Var;
    }

    @Override
    public final void a() {
        pp0 pp0Var = this.f36121a;
        if (pp0Var.f37428b.size() == 0) {
            pp0Var.N.setPivotX(0.0f);
            pp0Var.N.setPivotY(0.0f);
            pp0Var.W(false);
            return;
        }
        pp0Var.N.invalidate();
        pp0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        pp0 pp0Var = this.f36121a;
        org.telegram.ui.Components.du duVar = pp0Var.J;
        pp0Var.f37427a = editable;
        duVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        pp0 pp0Var = this.f36121a;
        pp0Var.removeSelfFromStack();
        if (!z4) {
            pp0Var.V(pp0Var.f37428b, pp0Var.f37429c, z10, i10);
        }
    }

    @Override
    public final void c() {
    }
}
