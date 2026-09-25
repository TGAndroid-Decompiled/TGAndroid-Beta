package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class hj0 extends xg.i {
    public boolean J;
    public final kj0 K;

    public hj0(kj0 kj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = kj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        kj0 kj0Var = this.K;
        kj0Var.f35091l0 = dp;
        kj0Var.f35090k0.G();
        if (this.J != kj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = kj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.wl0 wl0Var = kj0Var.d;
                ji.o oVar = new ji.o(kj0Var.getContext(), 2, 0.6f);
                oVar.f43111a = 1;
                oVar.f13094p = AndroidUtilities.dp(36.0f);
                wl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
