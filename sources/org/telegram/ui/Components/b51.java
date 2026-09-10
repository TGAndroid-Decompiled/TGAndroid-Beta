package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b51 implements zv0 {
    public int f21728a;
    public boolean f21729b;
    public final c51 f21730c;

    public b51(c51 c51Var) {
        this.f21730c = c51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f21728a != i10 || this.f21729b != z10) {
            this.f21728a = i10;
            this.f21729b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                c51 c51Var = this.f21730c;
                if (!c51Var.f21993x0) {
                    c51Var.E0.setAllowNestedScroll(false);
                    c51Var.f21993x0 = true;
                }
            }
        }
    }
}
