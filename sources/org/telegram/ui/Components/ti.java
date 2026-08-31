package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ti extends i61 {
    public final xi c3;

    public ti(xi xiVar, Context context, int i10, d dVar, qi qiVar, qi qiVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, dVar, qiVar, qiVar2, g6Var);
        this.c3 = xiVar;
    }

    @Override
    public final void C1() {
        xi xiVar = this.c3;
        xiVar.f26546b.X1(xiVar, 0);
    }

    @Override
    public final boolean E0(float f10) {
        int i10;
        mi miVar = this.c3.f26546b;
        int dp = AndroidUtilities.dp(30.0f) + miVar.Y1[0];
        if (!miVar.f29043d0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        if (f10 < dp + i10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        xi xiVar = this.c3;
        xiVar.f26546b.X1(xiVar, 0);
    }
}
