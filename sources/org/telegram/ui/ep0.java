package org.telegram.ui;

import android.text.Editable;
public final class ep0 implements yp0 {
    public final ip0 f38004a;

    public ep0(ip0 ip0Var) {
        this.f38004a = ip0Var;
    }

    @Override
    public final void a() {
        ip0 ip0Var = this.f38004a;
        if (ip0Var.f39240b.size() == 0) {
            ip0Var.M.setPivotX(0.0f);
            ip0Var.M.setPivotY(0.0f);
            ip0Var.V(false);
            return;
        }
        ip0Var.M.invalidate();
        ip0Var.V(true);
    }

    @Override
    public final void b(Editable editable) {
        ip0 ip0Var = this.f38004a;
        org.telegram.ui.Components.ut utVar = ip0Var.I;
        ip0Var.f39239a = editable;
        utVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i9, boolean z10, boolean z11) {
        ip0 ip0Var = this.f38004a;
        ip0Var.removeSelfFromStack();
        if (!z10) {
            ip0Var.U(ip0Var.f39240b, ip0Var.f39241c, z11, i9);
        }
    }

    @Override
    public final void h() {
    }
}
