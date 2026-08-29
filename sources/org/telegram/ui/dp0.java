package org.telegram.ui;

import android.text.Editable;
public final class dp0 implements yp0 {
    public final hp0 f37572a;

    public dp0(hp0 hp0Var) {
        this.f37572a = hp0Var;
    }

    @Override
    public final void a() {
        hp0 hp0Var = this.f37572a;
        if (hp0Var.f38985b.size() == 0) {
            hp0Var.M.setPivotX(0.0f);
            hp0Var.M.setPivotY(0.0f);
            hp0Var.W(false);
            return;
        }
        hp0Var.M.invalidate();
        hp0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        hp0 hp0Var = this.f37572a;
        org.telegram.ui.Components.au auVar = hp0Var.I;
        hp0Var.f38984a = editable;
        auVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        hp0 hp0Var = this.f37572a;
        hp0Var.removeSelfFromStack();
        if (!z10) {
            hp0Var.V(hp0Var.f38985b, hp0Var.f38986c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
