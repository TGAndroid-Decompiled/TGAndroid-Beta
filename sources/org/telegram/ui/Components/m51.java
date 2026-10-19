package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements jw0 {
    public int f28395a;
    public boolean f28396b;
    public final n51 f28397c;

    public m51(n51 n51Var) {
        this.f28397c = n51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f28395a != i10 || this.f28396b != z10) {
            this.f28395a = i10;
            this.f28396b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                n51 n51Var = this.f28397c;
                if (!n51Var.f28685x0) {
                    n51Var.E0.setAllowNestedScroll(false);
                    n51Var.f28685x0 = true;
                }
            }
        }
    }
}
