package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p41 implements pv0 {
    public int f29958a;
    public boolean f29959b;
    public final q41 f29960c;

    public p41(q41 q41Var) {
        this.f29960c = q41Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        if (this.f29958a != i10 || this.f29959b != z4) {
            this.f29958a = i10;
            this.f29959b = z4;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                q41 q41Var = this.f29960c;
                if (!q41Var.f30274u0) {
                    q41Var.B0.setAllowNestedScroll(false);
                    q41Var.f30274u0 = true;
                }
            }
        }
    }
}
