package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o41 implements ov0 {
    public int f26673a;
    public boolean f26674b;
    public final p41 f26675c;

    public o41(p41 p41Var) {
        this.f26675c = p41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f26673a != i10 || this.f26674b != z10) {
            this.f26673a = i10;
            this.f26674b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                p41 p41Var = this.f26675c;
                if (!p41Var.f26942x0) {
                    p41Var.E0.setAllowNestedScroll(false);
                    p41Var.f26942x0 = true;
                }
            }
        }
    }
}
