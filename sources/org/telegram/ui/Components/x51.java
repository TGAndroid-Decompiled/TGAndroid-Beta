package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class x51 implements tw0 {
    public int f32832a;
    public boolean f32833b;
    public final y51 f32834c;

    public x51(y51 y51Var) {
        this.f32834c = y51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f32832a != i10 || this.f32833b != z10) {
            this.f32832a = i10;
            this.f32833b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                y51 y51Var = this.f32834c;
                if (!y51Var.f33094x0) {
                    y51Var.E0.setAllowNestedScroll(false);
                    y51Var.f33094x0 = true;
                }
            }
        }
    }
}
