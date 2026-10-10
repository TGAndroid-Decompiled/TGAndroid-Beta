package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w51 implements sw0 {
    public int f32603a;
    public boolean f32604b;
    public final x51 f32605c;

    public w51(x51 x51Var) {
        this.f32605c = x51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f32603a != i10 || this.f32604b != z10) {
            this.f32603a = i10;
            this.f32604b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                x51 x51Var = this.f32605c;
                if (!x51Var.f32844x0) {
                    x51Var.E0.setAllowNestedScroll(false);
                    x51Var.f32844x0 = true;
                }
            }
        }
    }
}
