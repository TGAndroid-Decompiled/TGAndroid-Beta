package org.telegram.ui;

import android.text.Editable;
public final class np0 implements gq0 {
    public final rp0 f39501a;

    public np0(rp0 rp0Var) {
        this.f39501a = rp0Var;
    }

    @Override
    public final void a() {
        rp0 rp0Var = this.f39501a;
        if (rp0Var.f41025b.size() == 0) {
            rp0Var.N.setPivotX(0.0f);
            rp0Var.N.setPivotY(0.0f);
            rp0Var.W(false);
            return;
        }
        rp0Var.N.invalidate();
        rp0Var.W(true);
    }

    @Override
    public final void c(Editable editable) {
        rp0 rp0Var = this.f39501a;
        org.telegram.ui.Components.fu fuVar = rp0Var.J;
        rp0Var.f41024a = editable;
        fuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        rp0 rp0Var = this.f39501a;
        rp0Var.removeSelfFromStack();
        if (!z4) {
            rp0Var.V(rp0Var.f41025b, rp0Var.f41026c, z10, i10);
        }
    }

    @Override
    public final void d() {
    }
}
