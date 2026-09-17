package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n41 implements nv0 {
    public int f28611a;
    public boolean f28612b;
    public final o41 f28613c;

    public n41(o41 o41Var) {
        this.f28613c = o41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28611a != i10 || this.f28612b != z10) {
            this.f28611a = i10;
            this.f28612b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o41 o41Var = this.f28613c;
                if (!o41Var.f28955x0) {
                    o41Var.E0.setAllowNestedScroll(false);
                    o41Var.f28955x0 = true;
                }
            }
        }
    }
}
