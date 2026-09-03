package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n41 implements ov0 {
    public int f29384a;
    public boolean f29385b;
    public final o41 f29386c;

    public n41(o41 o41Var) {
        this.f29386c = o41Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        if (this.f29384a != i10 || this.f29385b != z4) {
            this.f29384a = i10;
            this.f29385b = z4;
            if (i10 > AndroidUtilities.dp(20.0f)) {
                o41 o41Var = this.f29386c;
                if (!o41Var.f29658u0) {
                    o41Var.B0.setAllowNestedScroll(false);
                    o41Var.f29658u0 = true;
                }
            }
        }
    }
}
