package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v51 implements rw0 {
    public int f31696a;
    public boolean f31697b;
    public final w51 f31698c;

    public v51(w51 w51Var) {
        this.f31698c = w51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f31696a != i10 || this.f31697b != z10) {
            this.f31696a = i10;
            this.f31697b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                w51 w51Var = this.f31698c;
                if (!w51Var.f32556x0) {
                    w51Var.E0.setAllowNestedScroll(false);
                    w51Var.f32556x0 = true;
                }
            }
        }
    }
}
