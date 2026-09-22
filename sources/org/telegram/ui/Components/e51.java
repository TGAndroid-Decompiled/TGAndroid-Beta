package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e51 implements bw0 {
    public int f23863a;
    public boolean f23864b;
    public final f51 f23865c;

    public e51(f51 f51Var) {
        this.f23865c = f51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f23863a != i10 || this.f23864b != z10) {
            this.f23863a = i10;
            this.f23864b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                f51 f51Var = this.f23865c;
                if (!f51Var.f24115x0) {
                    f51Var.E0.setAllowNestedScroll(false);
                    f51Var.f24115x0 = true;
                }
            }
        }
    }
}
