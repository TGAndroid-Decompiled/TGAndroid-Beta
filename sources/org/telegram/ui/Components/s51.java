package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s51 implements nw0 {
    public int f30385a;
    public boolean f30386b;
    public final t51 f30387c;

    public s51(t51 t51Var) {
        this.f30387c = t51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f30385a != i10 || this.f30386b != z10) {
            this.f30385a = i10;
            this.f30386b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                t51 t51Var = this.f30387c;
                if (!t51Var.f30646x0) {
                    t51Var.E0.setAllowNestedScroll(false);
                    t51Var.f30646x0 = true;
                }
            }
        }
    }
}
