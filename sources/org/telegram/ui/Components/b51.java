package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b51 implements zv0 {
    public int f22862a;
    public boolean f22863b;
    public final c51 f22864c;

    public b51(c51 c51Var) {
        this.f22864c = c51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f22862a != i10 || this.f22863b != z10) {
            this.f22862a = i10;
            this.f22863b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                c51 c51Var = this.f22864c;
                if (!c51Var.f23176x0) {
                    c51Var.E0.setAllowNestedScroll(false);
                    c51Var.f23176x0 = true;
                }
            }
        }
    }
}
