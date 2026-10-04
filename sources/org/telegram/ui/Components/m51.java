package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m51 implements kw0 {
    public int f28531a;
    public boolean f28532b;
    public final n51 f28533c;

    public m51(n51 n51Var) {
        this.f28533c = n51Var;
    }

    @Override
    public final void F(int i10, boolean z10) {
        if (this.f28531a != i10 || this.f28532b != z10) {
            this.f28531a = i10;
            this.f28532b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                n51 n51Var = this.f28533c;
                if (!n51Var.f28869x0) {
                    n51Var.E0.setAllowNestedScroll(false);
                    n51Var.f28869x0 = true;
                }
            }
        }
    }
}
