package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a61 implements xw0 {
    public int f24243a;
    public boolean f24244b;
    public final b61 f24245c;

    public a61(b61 b61Var) {
        this.f24245c = b61Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f24243a != i10 || this.f24244b != z10) {
            this.f24243a = i10;
            this.f24244b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                b61 b61Var = this.f24245c;
                if (!b61Var.f24558x0) {
                    b61Var.E0.setAllowNestedScroll(false);
                    b61Var.f24558x0 = true;
                }
            }
        }
    }
}
