package org.telegram.ui;

import android.text.Editable;
public final class hq0 implements br0 {
    public final lq0 f34212a;

    public hq0(lq0 lq0Var) {
        this.f34212a = lq0Var;
    }

    @Override
    public final void a() {
        lq0 lq0Var = this.f34212a;
        if (lq0Var.f35432b.size() == 0) {
            lq0Var.Q.setPivotX(0.0f);
            lq0Var.Q.setPivotY(0.0f);
            lq0Var.W(false);
            return;
        }
        lq0Var.Q.invalidate();
        lq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        lq0 lq0Var = this.f34212a;
        org.telegram.ui.Components.ju juVar = lq0Var.M;
        lq0Var.f35431a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.f34212a;
        lq0Var.removeSelfFromStack();
        if (!z10) {
            lq0Var.V(lq0Var.f35432b, lq0Var.f35433c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
