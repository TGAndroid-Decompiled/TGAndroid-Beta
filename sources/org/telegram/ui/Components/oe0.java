package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class oe0 implements u0.g, d5 {
    public final ze0 f27035a;

    public oe0(ze0 ze0Var) {
        this.f27035a = ze0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ze0 ze0Var = this.f27035a;
        ze0Var.K.a(ze0Var.N, z10, i10, 0L);
        ze0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        ze0 ze0Var = this.f27035a;
        ze0Var.H(!ze0Var.f30857s);
    }
}
