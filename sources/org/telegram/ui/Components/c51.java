package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c51 implements aw0 {
    public int f23213a;
    public boolean f23214b;
    public final d51 f23215c;

    public c51(d51 d51Var) {
        this.f23215c = d51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23213a != i10 || this.f23214b != z10) {
            this.f23213a = i10;
            this.f23214b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                d51 d51Var = this.f23215c;
                if (!d51Var.f23510x0) {
                    d51Var.E0.setAllowNestedScroll(false);
                    d51Var.f23510x0 = true;
                }
            }
        }
    }
}
