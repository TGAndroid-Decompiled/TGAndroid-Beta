package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d51 implements bw0 {
    public int f23509a;
    public boolean f23510b;
    public final e51 f23511c;

    public d51(e51 e51Var) {
        this.f23511c = e51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23509a != i10 || this.f23510b != z10) {
            this.f23509a = i10;
            this.f23510b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                e51 e51Var = this.f23511c;
                if (!e51Var.f23885x0) {
                    e51Var.E0.setAllowNestedScroll(false);
                    e51Var.f23885x0 = true;
                }
            }
        }
    }
}
