package org.telegram.ui;

import android.text.Editable;
public final class bq0 implements vq0 {
    public final fq0 f35200a;

    public bq0(fq0 fq0Var) {
        this.f35200a = fq0Var;
    }

    @Override
    public final void a() {
        fq0 fq0Var = this.f35200a;
        if (fq0Var.f36375b.size() == 0) {
            fq0Var.Q.setPivotX(0.0f);
            fq0Var.Q.setPivotY(0.0f);
            fq0Var.U(false);
            return;
        }
        fq0Var.Q.invalidate();
        fq0Var.U(true);
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f35200a;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.f36374a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f35200a;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.T(fq0Var.f36375b, fq0Var.f36376c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
