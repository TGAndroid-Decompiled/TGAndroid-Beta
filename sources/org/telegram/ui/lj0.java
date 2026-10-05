package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lj0 extends xg.i {
    public boolean J;
    public final oj0 K;

    public lj0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = oj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        oj0 oj0Var = this.K;
        oj0Var.f39232l0 = dp;
        oj0Var.f39231k0.G();
        if (this.J != oj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = oj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.zl0 zl0Var = oj0Var.d;
                ji.o oVar = new ji.o(oj0Var.getContext(), 2, 0.6f);
                oVar.f46706a = 1;
                oVar.f14237p = AndroidUtilities.dp(36.0f);
                zl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
