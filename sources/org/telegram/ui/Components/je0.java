package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class je0 implements u0.g, y4 {
    public final ue0 f28105a;

    public je0(ue0 ue0Var) {
        this.f28105a = ue0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        ue0 ue0Var = this.f28105a;
        ue0Var.H.a(ue0Var.K, z4, i10, 0L);
        ue0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        ue0 ue0Var = this.f28105a;
        ue0Var.G(!ue0Var.f31668s);
    }
}
