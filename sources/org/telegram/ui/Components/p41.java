package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p41 implements pv0 {
    public int f26925a;
    public boolean f26926b;
    public final q41 f26927c;

    public p41(q41 q41Var) {
        this.f26927c = q41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f26925a != i10 || this.f26926b != z10) {
            this.f26925a = i10;
            this.f26926b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                q41 q41Var = this.f26927c;
                if (!q41Var.f27210x0) {
                    q41Var.E0.setAllowNestedScroll(false);
                    q41Var.f27210x0 = true;
                }
            }
        }
    }
}
