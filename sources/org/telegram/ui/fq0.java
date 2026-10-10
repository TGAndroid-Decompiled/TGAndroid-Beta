package org.telegram.ui;

import android.text.Editable;
public final class fq0 implements ar0 {
    public final kq0 f37712a;

    public fq0(kq0 kq0Var) {
        this.f37712a = kq0Var;
    }

    @Override
    public final void a() {
        kq0 kq0Var = this.f37712a;
        if (kq0Var.f39374b.size() == 0) {
            kq0Var.Q.setPivotX(0.0f);
            kq0Var.Q.setPivotY(0.0f);
            kq0Var.W(false);
            return;
        }
        kq0Var.Q.invalidate();
        kq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f37712a;
        org.telegram.ui.Components.av avVar = kq0Var.M;
        kq0Var.f39373a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f37712a;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(kq0Var.f39374b, kq0Var.f39375c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
