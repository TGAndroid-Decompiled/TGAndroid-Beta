package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

public final class qd0 implements u0.g, x4 {

    public final be0 f31896a;

    public qd0(be0 be0Var) {
        this.f31896a = be0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        be0 be0Var = this.f31896a;
        be0Var.G.b(be0Var.J, z10, i10, 0L);
        be0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        be0 be0Var = this.f31896a;
        be0Var.H(!be0Var.f27080s);
    }
}
