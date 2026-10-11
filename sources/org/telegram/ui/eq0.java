package org.telegram.ui;

import android.text.Editable;
public final class eq0 implements zq0 {
    public final jq0 f37461a;

    public eq0(jq0 jq0Var) {
        this.f37461a = jq0Var;
    }

    @Override
    public final void a() {
        jq0 jq0Var = this.f37461a;
        if (jq0Var.f39134b.size() == 0) {
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
        jq0 jq0Var = this.f37461a;
        org.telegram.ui.Components.av avVar = jq0Var.M;
        jq0Var.f39133a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f37461a;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(jq0Var.f39134b, jq0Var.f39135c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
