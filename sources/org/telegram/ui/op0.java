package org.telegram.ui;

import android.text.Editable;
public final class op0 implements jq0 {
    public final tp0 f39865a;

    public op0(tp0 tp0Var) {
        this.f39865a = tp0Var;
    }

    @Override
    public final void a() {
        tp0 tp0Var = this.f39865a;
        if (tp0Var.f41799b.size() == 0) {
            tp0Var.Q.setPivotX(0.0f);
            tp0Var.Q.setPivotY(0.0f);
            tp0Var.W(false);
            return;
        }
        tp0Var.Q.invalidate();
        tp0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        tp0 tp0Var = this.f39865a;
        org.telegram.ui.Components.qu quVar = tp0Var.M;
        tp0Var.f41798a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        tp0 tp0Var = this.f39865a;
        tp0Var.removeSelfFromStack();
        if (!z10) {
            tp0Var.V(tp0Var.f41799b, tp0Var.f41800c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
