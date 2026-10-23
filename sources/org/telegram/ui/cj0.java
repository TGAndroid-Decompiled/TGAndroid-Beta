package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class cj0 extends yg.h {
    public boolean K;
    public final fj0 L;

    public cj0(fj0 fj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.L = fj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        fj0 fj0Var = this.L;
        fj0Var.f37356l0 = dp;
        fj0Var.f37355k0.G();
        if (this.K != fj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = fj0Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = fj0Var.d;
                li.n nVar = new li.n(fj0Var.getContext(), 2, 0.6f);
                nVar.f46484a = 1;
                nVar.f16207p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
