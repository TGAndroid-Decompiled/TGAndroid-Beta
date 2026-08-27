package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class t31 implements yu0 {

    public int f32646a;

    public boolean f32647b;

    public final u31 f32648c;

    public t31(u31 u31Var) {
        this.f32648c = u31Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f32646a == i10 && this.f32647b == z10) {
            return;
        }
        this.f32646a = i10;
        this.f32647b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            u31 u31Var = this.f32648c;
            if (u31Var.f32958t0) {
                return;
            }
            u31Var.A0.setAllowNestedScroll(false);
            u31Var.f32958t0 = true;
        }
    }
}
