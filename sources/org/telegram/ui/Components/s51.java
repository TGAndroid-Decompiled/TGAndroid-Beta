package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s51 implements nw0 {
    public int f28747a;
    public boolean f28748b;
    public final t51 f28749c;

    public s51(t51 t51Var) {
        this.f28749c = t51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28747a != i10 || this.f28748b != z10) {
            this.f28747a = i10;
            this.f28748b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                t51 t51Var = this.f28749c;
                if (!t51Var.f28978x0) {
                    t51Var.E0.setAllowNestedScroll(false);
                    t51Var.f28978x0 = true;
                }
            }
        }
    }
}
