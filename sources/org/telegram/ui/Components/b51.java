package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b51 implements zv0 {
    public int f22870a;
    public boolean f22871b;
    public final c51 f22872c;

    public b51(c51 c51Var) {
        this.f22872c = c51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f22870a != i10 || this.f22871b != z10) {
            this.f22870a = i10;
            this.f22871b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                c51 c51Var = this.f22872c;
                if (!c51Var.f23205x0) {
                    c51Var.E0.setAllowNestedScroll(false);
                    c51Var.f23205x0 = true;
                }
            }
        }
    }
}
