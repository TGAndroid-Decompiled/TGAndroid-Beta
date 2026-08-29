package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c41 implements gv0 {
    public int f27305a;
    public boolean f27306b;
    public final d41 f27307c;

    public c41(d41 d41Var) {
        this.f27307c = d41Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f27305a != i10 || this.f27306b != z10) {
            this.f27305a = i10;
            this.f27306b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                d41 d41Var = this.f27307c;
                if (!d41Var.f27652t0) {
                    d41Var.A0.setAllowNestedScroll(false);
                    d41Var.f27652t0 = true;
                }
            }
        }
    }
}
