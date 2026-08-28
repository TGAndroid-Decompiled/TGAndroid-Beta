package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r31 implements wu0 {
    public int f32075a;
    public boolean f32076b;
    public final s31 f32077c;

    public r31(s31 s31Var) {
        this.f32077c = s31Var;
    }

    @Override
    public final void G(int i9, boolean z10) {
        if (this.f32075a != i9 || this.f32076b != z10) {
            this.f32075a = i9;
            this.f32076b = z10;
            if (i9 > AndroidUtilities.dp(20.0f)) {
                s31 s31Var = this.f32077c;
                if (!s31Var.f32354t0) {
                    s31Var.A0.setAllowNestedScroll(false);
                    s31Var.f32354t0 = true;
                }
            }
        }
    }
}
