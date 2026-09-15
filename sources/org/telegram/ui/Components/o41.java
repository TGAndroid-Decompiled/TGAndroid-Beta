package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o41 implements ov0 {
    public int f26676a;
    public boolean f26677b;
    public final p41 f26678c;

    public o41(p41 p41Var) {
        this.f26678c = p41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f26676a != i10 || this.f26677b != z10) {
            this.f26676a = i10;
            this.f26677b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                p41 p41Var = this.f26678c;
                if (!p41Var.f26945x0) {
                    p41Var.E0.setAllowNestedScroll(false);
                    p41Var.f26945x0 = true;
                }
            }
        }
    }
}
