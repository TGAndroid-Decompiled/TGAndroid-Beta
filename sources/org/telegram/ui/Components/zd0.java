package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class zd0 implements u0.g, b5 {
    public final ke0 f35327a;

    public zd0(ke0 ke0Var) {
        this.f35327a = ke0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ke0 ke0Var = this.f35327a;
        ke0Var.G.a(ke0Var.J, z10, i10, 0L);
        ke0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        ke0 ke0Var = this.f35327a;
        ke0Var.G(!ke0Var.f30029s);
    }
}
