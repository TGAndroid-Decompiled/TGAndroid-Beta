package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class qe0 implements u0.g, d5 {
    public final bf0 f27670a;

    public qe0(bf0 bf0Var) {
        this.f27670a = bf0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        bf0 bf0Var = this.f27670a;
        bf0Var.K.a(bf0Var.N, z10, i10, 0L);
        bf0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        bf0 bf0Var = this.f27670a;
        bf0Var.H(!bf0Var.f22962s);
    }
}
