package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d51 implements aw0 {
    public int f23426a;
    public boolean f23427b;
    public final e51 f23428c;

    public d51(e51 e51Var) {
        this.f23428c = e51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23426a != i10 || this.f23427b != z10) {
            this.f23426a = i10;
            this.f23427b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                e51 e51Var = this.f23428c;
                if (!e51Var.f23789x0) {
                    e51Var.E0.setAllowNestedScroll(false);
                    e51Var.f23789x0 = true;
                }
            }
        }
    }
}
