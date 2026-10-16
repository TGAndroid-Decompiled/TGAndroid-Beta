package org.telegram.ui;

import android.text.Editable;
public final class jq0 implements er0 {
    public final oq0 f37121a;

    public jq0(oq0 oq0Var) {
        this.f37121a = oq0Var;
    }

    @Override
    public final void a() {
        oq0 oq0Var = this.f37121a;
        if (oq0Var.f38729b.size() == 0) {
            oq0Var.Q.setPivotX(0.0f);
            oq0Var.Q.setPivotY(0.0f);
            oq0Var.W(false);
            return;
        }
        oq0Var.Q.invalidate();
        oq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        oq0 oq0Var = this.f37121a;
        org.telegram.ui.Components.vu vuVar = oq0Var.M;
        oq0Var.f38728a = editable;
        vuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        oq0 oq0Var = this.f37121a;
        oq0Var.removeSelfFromStack();
        if (!z10) {
            oq0Var.V(oq0Var.f38729b, oq0Var.f38730c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
