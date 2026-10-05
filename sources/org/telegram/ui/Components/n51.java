package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n51 implements lw0 {
    public int f28976a;
    public boolean f28977b;
    public final o51 f28978c;

    public n51(o51 o51Var) {
        this.f28978c = o51Var;
    }

    @Override
    public final void F(int i10, boolean z10) {
        if (this.f28976a != i10 || this.f28977b != z10) {
            this.f28976a = i10;
            this.f28977b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o51 o51Var = this.f28978c;
                if (!o51Var.f29350x0) {
                    o51Var.E0.setAllowNestedScroll(false);
                    o51Var.f29350x0 = true;
                }
            }
        }
    }
}
