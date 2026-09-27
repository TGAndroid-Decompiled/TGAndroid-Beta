package org.telegram.ui;

import android.text.Editable;
public final class bq0 implements vq0 {
    public final fq0 f32415a;

    public bq0(fq0 fq0Var) {
        this.f32415a = fq0Var;
    }

    @Override
    public final void a() {
        fq0 fq0Var = this.f32415a;
        if (fq0Var.f33608b.size() == 0) {
            fq0Var.Q.setPivotX(0.0f);
            fq0Var.Q.setPivotY(0.0f);
            fq0Var.W(false);
            return;
        }
        fq0Var.Q.invalidate();
        fq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f32415a;
        org.telegram.ui.Components.lu luVar = fq0Var.M;
        fq0Var.f33607a = editable;
        luVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f32415a;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.V(fq0Var.f33608b, fq0Var.f33609c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
