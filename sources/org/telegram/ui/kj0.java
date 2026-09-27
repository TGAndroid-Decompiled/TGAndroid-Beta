package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends xg.i {
    public boolean J;
    public final nj0 K;

    public kj0(nj0 nj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = nj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        nj0 nj0Var = this.K;
        nj0Var.f36034l0 = dp;
        nj0Var.f36033k0.G();
        if (this.J != nj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = nj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.yl0 yl0Var = nj0Var.d;
                ji.o oVar = new ji.o(nj0Var.getContext(), 2, 0.6f);
                oVar.f43155a = 1;
                oVar.f13097p = AndroidUtilities.dp(36.0f);
                yl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
