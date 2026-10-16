package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends i71 {
    public final hj f24127d3;

    public dj(hj hjVar, Context context, int i10, d dVar, zi ziVar, zi ziVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, ziVar, ziVar2, c6Var);
        this.f24127d3 = hjVar;
    }

    @Override
    public final void D1() {
        hj hjVar = this.f24127d3;
        hjVar.f27360b.b2(hjVar, 0);
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        vi viVar = this.f24127d3.f27360b;
        int dp = AndroidUtilities.dp(30.0f) + viVar.f29670e2[0];
        if (!viVar.f29675g0) {
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
        hj hjVar = this.f24127d3;
        hjVar.f27360b.b2(hjVar, 0);
    }
}
