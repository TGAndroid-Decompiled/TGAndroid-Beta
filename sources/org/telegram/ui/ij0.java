package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ij0 extends xg.i {
    public boolean J;
    public final lj0 K;

    public ij0(lj0 lj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = lj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        lj0 lj0Var = this.K;
        lj0Var.f35359l0 = dp;
        lj0Var.f35358k0.G();
        if (this.J != lj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = lj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.wl0 wl0Var = lj0Var.d;
                ji.o oVar = new ji.o(lj0Var.getContext(), 2, 0.6f);
                oVar.f43096a = 1;
                oVar.f13094p = AndroidUtilities.dp(36.0f);
                wl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
