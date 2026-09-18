package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p41 implements pv0 {
    public int f26928a;
    public boolean f26929b;
    public final q41 f26930c;

    public p41(q41 q41Var) {
        this.f26930c = q41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f26928a != i10 || this.f26929b != z10) {
            this.f26928a = i10;
            this.f26929b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                q41 q41Var = this.f26930c;
                if (!q41Var.f27213x0) {
                    q41Var.E0.setAllowNestedScroll(false);
                    q41Var.f27213x0 = true;
                }
            }
        }
    }
}
