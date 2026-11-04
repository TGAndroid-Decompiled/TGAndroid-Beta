package org.telegram.ui.Components;
public final class x21 implements pt0 {
    public int f40210a;
    public boolean f40211b;
    public final y21 f40212c;

    public x21(y21 y21Var) {
        this.f40212c = y21Var;
    }

    @Override
    public final void K(int i3, boolean z10) {
        if (this.f40210a != i3 || this.f40211b != z10) {
            this.f40210a = i3;
            this.f40211b = z10;
            if (i3 > org.telegram.messenger.g0.L(20.0f)) {
                y21 y21Var = this.f40212c;
                if (!y21Var.f40595h0) {
                    y21Var.f40601o0.f28614r0 = false;
                    y21Var.f40595h0 = true;
                }
            }
        }
    }
}
