package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ij extends p71 {
    public final mj f27176d3;

    public ij(mj mjVar, Context context, int i10, d dVar, ej ejVar, ej ejVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, ejVar, ejVar2, c6Var);
        this.f27176d3 = mjVar;
    }

    @Override
    public final void D1() {
        mj mjVar = this.f27176d3;
        mjVar.f30574b.b2(mjVar, 0);
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        aj ajVar = this.f27176d3.f30574b;
        int dp = AndroidUtilities.dp(30.0f) + ajVar.f24340e2[0];
        if (!ajVar.f24345g0) {
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
        mj mjVar = this.f27176d3;
        mjVar.f30574b.b2(mjVar, 0);
    }
}
