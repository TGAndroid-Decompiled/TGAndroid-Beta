package org.telegram.ui;

import android.text.Editable;
public final class gq0 implements ar0 {
    public final kq0 f36775a;

    public gq0(kq0 kq0Var) {
        this.f36775a = kq0Var;
    }

    @Override
    public final void a() {
        kq0 kq0Var = this.f36775a;
        if (kq0Var.f38132b.size() == 0) {
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
        kq0 kq0Var = this.f36775a;
        org.telegram.ui.Components.hu huVar = kq0Var.M;
        kq0Var.f38131a = editable;
        huVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f36775a;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(kq0Var.f38132b, kq0Var.f38133c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
