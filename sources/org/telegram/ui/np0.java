package org.telegram.ui;

import android.text.Editable;
public final class np0 implements iq0 {
    public final sp0 f39675a;

    public np0(sp0 sp0Var) {
        this.f39675a = sp0Var;
    }

    @Override
    public final void a() {
        sp0 sp0Var = this.f39675a;
        if (sp0Var.f41511b.size() == 0) {
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
        sp0 sp0Var = this.f39675a;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41510a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f39675a;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(sp0Var.f41511b, sp0Var.f41512c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
