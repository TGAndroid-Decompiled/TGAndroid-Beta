package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ie0 implements u0.g, y4 {
    public final te0 f25692a;

    public ie0(te0 te0Var) {
        this.f25692a = te0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        te0 te0Var = this.f25692a;
        te0Var.H.a(te0Var.K, z4, i10, 0L);
        te0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        te0 te0Var = this.f25692a;
        te0Var.G(!te0Var.f28979s);
    }
}
