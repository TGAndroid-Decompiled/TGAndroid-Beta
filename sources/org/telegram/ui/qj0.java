package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class qj0 extends xg.i {
    public boolean J;
    public final tj0 K;

    public qj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = tj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        tj0 tj0Var = this.K;
        tj0Var.f37822l0 = dp;
        tj0Var.f37821k0.G();
        if (this.J != tj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = tj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.ml0 ml0Var = tj0Var.d;
                ji.o oVar = new ji.o(tj0Var.getContext(), 2, 0.6f);
                oVar.f42852a = 1;
                oVar.f13105p = AndroidUtilities.dp(36.0f);
                ml0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
