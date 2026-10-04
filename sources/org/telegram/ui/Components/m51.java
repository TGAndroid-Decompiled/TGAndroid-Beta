package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements kw0 {
    public int f28532a;
    public boolean f28533b;
    public final n51 f28534c;

    public m51(n51 n51Var) {
        this.f28534c = n51Var;
    }

    @Override
    public final void F(int i10, boolean z10) {
        if (this.f28532a != i10 || this.f28533b != z10) {
            this.f28532a = i10;
            this.f28533b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                n51 n51Var = this.f28534c;
                if (!n51Var.f28870x0) {
                    n51Var.E0.setAllowNestedScroll(false);
                    n51Var.f28870x0 = true;
                }
            }
        }
    }
}
