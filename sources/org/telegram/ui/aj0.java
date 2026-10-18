package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class aj0 extends yg.h {
    public boolean J;
    public final dj0 K;

    public aj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = dj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        dj0 dj0Var = this.K;
        dj0Var.f36242l0 = dp;
        dj0Var.f36241k0.G();
        if (this.J != dj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = dj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.im0 im0Var = dj0Var.d;
                li.n nVar = new li.n(dj0Var.getContext(), 2, 0.6f);
                nVar.f46099a = 1;
                nVar.f16145p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
