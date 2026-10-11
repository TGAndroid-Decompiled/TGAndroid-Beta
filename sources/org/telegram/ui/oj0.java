package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class oj0 extends xg.i {
    public boolean J;
    public final rj0 K;

    public oj0(rj0 rj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = rj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        rj0 rj0Var = this.K;
        rj0Var.f41463l0 = dp;
        rj0Var.f41462k0.G();
        if (this.J != rj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = rj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.sm0 sm0Var = rj0Var.d;
                ji.o oVar = new ji.o(rj0Var.getContext(), 2, 0.6f);
                oVar.f47917a = 1;
                oVar.f14272p = AndroidUtilities.dp(36.0f);
                sm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
