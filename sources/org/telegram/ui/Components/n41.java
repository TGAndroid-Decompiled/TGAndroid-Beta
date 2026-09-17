package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n41 implements nv0 {
    public int f28638a;
    public boolean f28639b;
    public final o41 f28640c;

    public n41(o41 o41Var) {
        this.f28640c = o41Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28638a != i10 || this.f28639b != z10) {
            this.f28638a = i10;
            this.f28639b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o41 o41Var = this.f28640c;
                if (!o41Var.f28982x0) {
                    o41Var.E0.setAllowNestedScroll(false);
                    o41Var.f28982x0 = true;
                }
            }
        }
    }
}
