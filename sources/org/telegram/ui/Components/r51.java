package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r51 implements mw0 {
    public int f30070a;
    public boolean f30071b;
    public final s51 f30072c;

    public r51(s51 s51Var) {
        this.f30072c = s51Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        if (this.f30070a != i10 || this.f30071b != z10) {
            this.f30070a = i10;
            this.f30071b = z10;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                s51 s51Var = this.f30072c;
                if (!s51Var.f30451x0) {
                    s51Var.E0.setAllowNestedScroll(false);
                    s51Var.f30451x0 = true;
                }
            }
        }
    }
}
