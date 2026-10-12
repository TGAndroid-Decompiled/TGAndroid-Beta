package org.telegram.ui;

import android.text.Editable;
public final class lq0 implements gr0 {
    public final qq0 f38074a;

    public lq0(qq0 qq0Var) {
        this.f38074a = qq0Var;
    }

    @Override
    public final void a() {
        qq0 qq0Var = this.f38074a;
        if (qq0Var.f39517b.size() == 0) {
            qq0Var.Q.setPivotX(0.0f);
            qq0Var.Q.setPivotY(0.0f);
            qq0Var.W(false);
            return;
        }
        qq0Var.Q.invalidate();
        qq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        qq0 qq0Var = this.f38074a;
        org.telegram.ui.Components.vu vuVar = qq0Var.M;
        qq0Var.f39516a = editable;
        vuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        qq0 qq0Var = this.f38074a;
        qq0Var.removeSelfFromStack();
        if (!z10) {
            qq0Var.V(qq0Var.f39517b, qq0Var.f39518c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
