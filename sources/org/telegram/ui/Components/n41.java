package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n41 implements nv0 {
    public int f28610a;
    public boolean f28611b;
    public final o41 f28612c;

    public n41(o41 o41Var) {
        this.f28612c = o41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28610a != i10 || this.f28611b != z10) {
            this.f28610a = i10;
            this.f28611b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o41 o41Var = this.f28612c;
                if (!o41Var.f28954x0) {
                    o41Var.E0.setAllowNestedScroll(false);
                    o41Var.f28954x0 = true;
                }
            }
        }
    }
}
