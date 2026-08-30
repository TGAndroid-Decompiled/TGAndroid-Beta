package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o41 implements pv0 {
    public int f27445a;
    public boolean f27446b;
    public final p41 f27447c;

    public o41(p41 p41Var) {
        this.f27447c = p41Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        if (this.f27445a != i10 || this.f27446b != z4) {
            this.f27445a = i10;
            this.f27446b = z4;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                p41 p41Var = this.f27447c;
                if (!p41Var.f27733u0) {
                    p41Var.B0.setAllowNestedScroll(false);
                    p41Var.f27733u0 = true;
                }
            }
        }
    }
}
