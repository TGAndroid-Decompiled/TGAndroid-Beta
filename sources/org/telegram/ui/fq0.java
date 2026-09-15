package org.telegram.ui;

import android.text.Editable;
public final class fq0 implements zq0 {
    public final jq0 f33645a;

    public fq0(jq0 jq0Var) {
        this.f33645a = jq0Var;
    }

    @Override
    public final void a() {
        jq0 jq0Var = this.f33645a;
        if (jq0Var.f34952b.size() == 0) {
            jq0Var.Q.setPivotX(0.0f);
            jq0Var.Q.setPivotY(0.0f);
            jq0Var.W(false);
            return;
        }
        jq0Var.Q.invalidate();
        jq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f33645a;
        org.telegram.ui.Components.ju juVar = jq0Var.M;
        jq0Var.f34951a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f33645a;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(jq0Var.f34952b, jq0Var.f34953c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
