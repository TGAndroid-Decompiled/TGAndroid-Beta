package org.telegram.ui;

import android.text.Editable;
public final class pp0 implements kq0 {
    public final up0 f40229a;

    public pp0(up0 up0Var) {
        this.f40229a = up0Var;
    }

    @Override
    public final void a() {
        up0 up0Var = this.f40229a;
        if (up0Var.f42042b.size() == 0) {
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
        up0 up0Var = this.f40229a;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.f42041a = editable;
        quVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f40229a;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(up0Var.f42042b, up0Var.f42043c, z11, i10);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void c() {
    }
}
