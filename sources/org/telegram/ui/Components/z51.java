package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z51 implements uw0 {
    public int f35224a;
    public boolean f35225b;
    public final a61 f35226c;

    public z51(a61 a61Var) {
        this.f35226c = a61Var;
    }

    @Override
    public final void I(int i10, boolean z10) {
        if (this.f35224a != i10 || this.f35225b != z10) {
            this.f35224a = i10;
            this.f35225b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                a61 a61Var = this.f35226c;
                if (!a61Var.m0) {
                    a61Var.f26426t0.setAllowNestedScroll(false);
                    a61Var.m0 = true;
                }
            }
        }
    }
}
