package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n41 implements ov0 {
    public int f26344a;
    public boolean f26345b;
    public final o41 f26346c;

    public n41(o41 o41Var) {
        this.f26346c = o41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f26344a != i10 || this.f26345b != z10) {
            this.f26344a = i10;
            this.f26345b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o41 o41Var = this.f26346c;
                if (!o41Var.f26589x0) {
                    o41Var.E0.setAllowNestedScroll(false);
                    o41Var.f26589x0 = true;
                }
            }
        }
    }
}
