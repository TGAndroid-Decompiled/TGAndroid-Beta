package org.telegram.ui;

import android.text.Editable;
public final class np0 implements iq0 {
    public final sp0 f39674a;

    public np0(sp0 sp0Var) {
        this.f39674a = sp0Var;
    }

    @Override
    public final void a() {
        sp0 sp0Var = this.f39674a;
        if (sp0Var.f41510b.size() == 0) {
            sp0Var.Q.setPivotX(0.0f);
            sp0Var.Q.setPivotY(0.0f);
            sp0Var.W(false);
            return;
        }
        sp0Var.Q.invalidate();
        sp0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        sp0 sp0Var = this.f39674a;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41509a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f39674a;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(sp0Var.f41510b, sp0Var.f41511c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
