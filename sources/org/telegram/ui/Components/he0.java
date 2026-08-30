package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class he0 implements u0.g, y4 {
    public final se0 f25404a;

    public he0(se0 se0Var) {
        this.f25404a = se0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        se0 se0Var = this.f25404a;
        se0Var.H.a(se0Var.K, z4, i10, 0L);
        se0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        se0 se0Var = this.f25404a;
        se0Var.G(!se0Var.f28697s);
    }
}
