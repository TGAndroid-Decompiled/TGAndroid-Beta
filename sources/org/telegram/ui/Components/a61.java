package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a61 implements vw0 {
    public int f26444a;
    public boolean f26445b;
    public final b61 f26446c;

    public a61(b61 b61Var) {
        this.f26446c = b61Var;
    }

    @Override
    public final void I(int i10, boolean z10) {
        if (this.f26444a != i10 || this.f26445b != z10) {
            this.f26444a = i10;
            this.f26445b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                b61 b61Var = this.f26446c;
                if (!b61Var.m0) {
                    b61Var.f26751t0.setAllowNestedScroll(false);
                    b61Var.m0 = true;
                }
            }
        }
    }
}
