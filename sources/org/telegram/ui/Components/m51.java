package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements jw0 {
    public int f28393a;
    public boolean f28394b;
    public final n51 f28395c;

    public m51(n51 n51Var) {
        this.f28395c = n51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f28393a != i10 || this.f28394b != z10) {
            this.f28393a = i10;
            this.f28394b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                n51 n51Var = this.f28395c;
                if (!n51Var.f28683x0) {
                    n51Var.E0.setAllowNestedScroll(false);
                    n51Var.f28683x0 = true;
                }
            }
        }
    }
}
