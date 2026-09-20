package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class me0 implements u0.g, c5 {
    public final xe0 f26395a;

    public me0(xe0 xe0Var) {
        this.f26395a = xe0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        xe0 xe0Var = this.f26395a;
        xe0Var.K.a(xe0Var.N, z10, i10, 0L);
        xe0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        xe0 xe0Var = this.f26395a;
        xe0Var.H(!xe0Var.f30252s);
    }
}
