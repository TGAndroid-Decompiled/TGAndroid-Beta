package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class bj0 extends yg.h {
    public boolean K;
    public final ej0 L;

    public bj0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.L = ej0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        ej0 ej0Var = this.L;
        ej0Var.f36933l0 = dp;
        ej0Var.f36932k0.G();
        if (this.K != ej0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = ej0Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.lm0 lm0Var = ej0Var.d;
                li.n nVar = new li.n(ej0Var.getContext(), 2, 0.6f);
                nVar.f46483a = 1;
                nVar.f16207p = AndroidUtilities.dp(36.0f);
                lm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
