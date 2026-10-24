package org.telegram.ui;

import android.text.Editable;
public final class pp0 implements kq0 {
    public final up0 f40616a;

    public pp0(up0 up0Var) {
        this.f40616a = up0Var;
    }

    @Override
    public final void a() {
        up0 up0Var = this.f40616a;
        if (up0Var.f42464b.size() == 0) {
            up0Var.Q.setPivotX(0.0f);
            up0Var.Q.setPivotY(0.0f);
            up0Var.W(false);
            return;
        }
        up0Var.Q.invalidate();
        up0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        up0 up0Var = this.f40616a;
        org.telegram.ui.Components.ou ouVar = up0Var.M;
        up0Var.f42463a = editable;
        ouVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f40616a;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(up0Var.f42464b, up0Var.f42465c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
