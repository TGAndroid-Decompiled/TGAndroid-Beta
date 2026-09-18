package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class pj0 extends xg.i {
    public boolean J;
    public final sj0 K;

    public pj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = sj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        sj0 sj0Var = this.K;
        sj0Var.f37356l0 = dp;
        sj0Var.f37355k0.G();
        if (this.J != sj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = sj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.wl0 wl0Var = sj0Var.d;
                ji.o oVar = new ji.o(sj0Var.getContext(), 2, 0.6f);
                oVar.f43079a = 1;
                oVar.f13105p = AndroidUtilities.dp(36.0f);
                wl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
