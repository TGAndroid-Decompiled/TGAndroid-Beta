package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class re0 implements u0.g, d5 {
    public final cf0 f27975a;

    public re0(cf0 cf0Var) {
        this.f27975a = cf0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        cf0 cf0Var = this.f27975a;
        cf0Var.K.a(cf0Var.N, z10, i10, 0L);
        cf0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        cf0 cf0Var = this.f27975a;
        cf0Var.H(!cf0Var.f23306s);
    }
}
