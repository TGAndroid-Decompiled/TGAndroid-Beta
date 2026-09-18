package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ne0 implements u0.g, d5 {
    public final ye0 f26676a;

    public ne0(ye0 ye0Var) {
        this.f26676a = ye0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ye0 ye0Var = this.f26676a;
        ye0Var.K.a(ye0Var.N, z10, i10, 0L);
        ye0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        ye0 ye0Var = this.f26676a;
        ye0Var.H(!ye0Var.f30565s);
    }
}
