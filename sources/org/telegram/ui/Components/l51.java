package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l51 implements iw0 {
    public int f28075a;
    public boolean f28076b;
    public final m51 f28077c;

    public l51(m51 m51Var) {
        this.f28077c = m51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28075a != i10 || this.f28076b != z10) {
            this.f28075a = i10;
            this.f28076b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                m51 m51Var = this.f28077c;
                if (!m51Var.f28400x0) {
                    m51Var.E0.setAllowNestedScroll(false);
                    m51Var.f28400x0 = true;
                }
            }
        }
    }
}
