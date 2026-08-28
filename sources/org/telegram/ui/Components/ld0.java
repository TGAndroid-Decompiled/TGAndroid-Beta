package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ld0 implements u0.g, x4 {
    public final wd0 f30420a;

    public ld0(wd0 wd0Var) {
        this.f30420a = wd0Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        wd0 wd0Var = this.f30420a;
        wd0Var.G.b(wd0Var.J, z10, i9, 0L);
        wd0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        wd0 wd0Var = this.f30420a;
        wd0Var.G(!wd0Var.f34212s);
    }
}
