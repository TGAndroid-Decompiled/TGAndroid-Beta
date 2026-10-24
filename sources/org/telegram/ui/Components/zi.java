package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends i71 {
    public final dj f33274g3;

    public zi(dj djVar, Context context, int i10, d dVar, vi viVar, vi viVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, dVar, viVar, viVar2, g6Var);
        this.f33274g3 = djVar;
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        ri riVar = this.f33274g3.f27704b;
        int dp = AndroidUtilities.dp(30.0f) + riVar.f30144e2[0];
        if (!riVar.f30149g0) {
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
        dj djVar = this.f33274g3;
        djVar.f27704b.f2(djVar, 0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        dj djVar = this.f33274g3;
        djVar.f27704b.f2(djVar, 0);
    }
}
