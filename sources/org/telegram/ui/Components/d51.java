package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d51 implements bw0 {
    public int f23496a;
    public boolean f23497b;
    public final e51 f23498c;

    public d51(e51 e51Var) {
        this.f23498c = e51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23496a != i10 || this.f23497b != z10) {
            this.f23496a = i10;
            this.f23497b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                e51 e51Var = this.f23498c;
                if (!e51Var.f23871x0) {
                    e51Var.E0.setAllowNestedScroll(false);
                    e51Var.f23871x0 = true;
                }
            }
        }
    }
}
