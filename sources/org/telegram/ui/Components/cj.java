package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class cj extends s61 {
    public final gj f23300f3;

    public cj(gj gjVar, Context context, int i10, d dVar, zi ziVar, zi ziVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, dVar, ziVar, ziVar2, f6Var);
        this.f23300f3 = gjVar;
    }

    @Override
    public final void D1() {
        gj gjVar = this.f23300f3;
        gjVar.f26655b.X1(gjVar, 0);
    }

    @Override
    public final boolean F0(float f7) {
        int i10;
        vi viVar = this.f23300f3.f26655b;
        int dp = AndroidUtilities.dp(30.0f) + viVar.f29086b2[0];
        if (!viVar.f29101g0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        if (f7 < dp + i10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        gj gjVar = this.f23300f3;
        gjVar.f26655b.X1(gjVar, 0);
    }
}
