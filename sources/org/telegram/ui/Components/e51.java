package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e51 implements cw0 {
    public int f23847a;
    public boolean f23848b;
    public final f51 f23849c;

    public e51(f51 f51Var) {
        this.f23849c = f51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23847a != i10 || this.f23848b != z10) {
            this.f23847a = i10;
            this.f23848b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                f51 f51Var = this.f23849c;
                if (!f51Var.f24174x0) {
                    f51Var.E0.setAllowNestedScroll(false);
                    f51Var.f24174x0 = true;
                }
            }
        }
    }
}
