package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l51 implements iw0 {
    public int f28082a;
    public boolean f28083b;
    public final m51 f28084c;

    public l51(m51 m51Var) {
        this.f28084c = m51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28082a != i10 || this.f28083b != z10) {
            this.f28082a = i10;
            this.f28083b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                m51 m51Var = this.f28084c;
                if (!m51Var.f28407x0) {
                    m51Var.E0.setAllowNestedScroll(false);
                    m51Var.f28407x0 = true;
                }
            }
        }
    }
}
