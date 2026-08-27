package org.telegram.ui;

import android.text.Editable;

public final class fp0 implements zp0 {

    public final jp0 f38180a;

    public fp0(jp0 jp0Var) {
        this.f38180a = jp0Var;
    }

    @Override
    public final void a() {
        jp0 jp0Var = this.f38180a;
        if (jp0Var.f39462b.size() != 0) {
            jp0Var.M.invalidate();
            jp0Var.W(true);
        } else {
            jp0Var.M.setPivotX(0.0f);
            jp0Var.M.setPivotY(0.0f);
            jp0Var.W(false);
        }
    }

    @Override
    public final void b(Editable editable) {
        jp0 jp0Var = this.f38180a;
        org.telegram.ui.Components.tt ttVar = jp0Var.I;
        jp0Var.f39461a = editable;
        ttVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        jp0 jp0Var = this.f38180a;
        jp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jp0Var.V(jp0Var.f39462b, jp0Var.f39463c, z11, i10);
    }

    @Override
    public final void h() {
    }
}
