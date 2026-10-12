package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r51 implements nw0 {
    public int f28742a;
    public boolean f28743b;
    public final s51 f28744c;

    public r51(s51 s51Var) {
        this.f28744c = s51Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        if (this.f28742a != i10 || this.f28743b != z10) {
            this.f28742a = i10;
            this.f28743b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                s51 s51Var = this.f28744c;
                if (!s51Var.f29040x0) {
                    s51Var.E0.setAllowNestedScroll(false);
                    s51Var.f29040x0 = true;
                }
            }
        }
    }
}
