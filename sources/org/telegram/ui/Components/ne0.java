package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ne0 implements u0.g, c5 {
    public final ye0 f25503a;

    public ne0(ye0 ye0Var) {
        this.f25503a = ye0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ye0 ye0Var = this.f25503a;
        ye0Var.K.a(ye0Var.N, z10, i10, 0L);
        ye0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        ye0 ye0Var = this.f25503a;
        ye0Var.H(!ye0Var.f29314s);
    }
}
