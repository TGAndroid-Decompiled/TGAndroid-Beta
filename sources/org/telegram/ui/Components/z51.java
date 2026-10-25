package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z51 implements uw0 {
    public int f35221a;
    public boolean f35222b;
    public final a61 f35223c;

    public z51(a61 a61Var) {
        this.f35223c = a61Var;
    }

    @Override
    public final void I(int i10, boolean z10) {
        if (this.f35221a != i10 || this.f35222b != z10) {
            this.f35221a = i10;
            this.f35222b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                a61 a61Var = this.f35223c;
                if (!a61Var.m0) {
                    a61Var.f26424t0.setAllowNestedScroll(false);
                    a61Var.m0 = true;
                }
            }
        }
    }
}
