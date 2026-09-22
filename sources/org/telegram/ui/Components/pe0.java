package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class pe0 implements u0.g, c5 {
    public final af0 f27340a;

    public pe0(af0 af0Var) {
        this.f27340a = af0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        af0 af0Var = this.f27340a;
        af0Var.K.a(af0Var.N, z10, i10, 0L);
        af0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        af0 af0Var = this.f27340a;
        af0Var.G(!af0Var.f22649s);
    }
}
