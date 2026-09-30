package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d51 implements bw0 {
    public int f23491a;
    public boolean f23492b;
    public final e51 f23493c;

    public d51(e51 e51Var) {
        this.f23493c = e51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f23491a != i10 || this.f23492b != z10) {
            this.f23491a = i10;
            this.f23492b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                e51 e51Var = this.f23493c;
                if (!e51Var.f23857x0) {
                    e51Var.E0.setAllowNestedScroll(false);
                    e51Var.f23857x0 = true;
                }
            }
        }
    }
}
