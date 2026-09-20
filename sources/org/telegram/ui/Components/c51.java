package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c51 implements zv0 {
    public int f23141a;
    public boolean f23142b;
    public final d51 f23143c;

    public c51(d51 d51Var) {
        this.f23143c = d51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23141a != i10 || this.f23142b != z10) {
            this.f23141a = i10;
            this.f23142b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                d51 d51Var = this.f23143c;
                if (!d51Var.f23496x0) {
                    d51Var.E0.setAllowNestedScroll(false);
                    d51Var.f23496x0 = true;
                }
            }
        }
    }
}
