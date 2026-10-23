package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class bj extends j71 {
    public final fj f25081g3;

    public bj(fj fjVar, Context context, int i10, d dVar, xi xiVar, xi xiVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, dVar, xiVar, xiVar2, g6Var);
        this.f25081g3 = fjVar;
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        ti tiVar = this.f25081g3.f28366b;
        int dp = AndroidUtilities.dp(30.0f) + tiVar.f30728e2[0];
        if (!tiVar.f30733g0) {
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
    public final void I1() {
        fj fjVar = this.f25081g3;
        fjVar.f28366b.f2(fjVar, 0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fj fjVar = this.f25081g3;
        fjVar.f28366b.f2(fjVar, 0);
    }
}
