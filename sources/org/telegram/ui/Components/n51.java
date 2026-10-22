package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n51 implements kw0 {
    public int f28695a;
    public boolean f28696b;
    public final o51 f28697c;

    public n51(o51 o51Var) {
        this.f28697c = o51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f28695a != i10 || this.f28696b != z10) {
            this.f28695a = i10;
            this.f28696b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o51 o51Var = this.f28697c;
                if (!o51Var.f28953x0) {
                    o51Var.E0.setAllowNestedScroll(false);
                    o51Var.f28953x0 = true;
                }
            }
        }
    }
}
