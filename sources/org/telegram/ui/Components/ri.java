package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ri extends i51 {
    public final vi f32183b3;

    public ri(vi viVar, Context context, int i9, d dVar, oi oiVar, oi oiVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, 0, false, dVar, oiVar, oiVar2, b6Var);
        this.f32183b3 = viVar;
    }

    @Override
    public final void C1() {
        vi viVar = this.f32183b3;
        viVar.f27493b.X1(viVar, 0);
    }

    @Override
    public final boolean E0(float f10) {
        int i9;
        ki kiVar = this.f32183b3.f27493b;
        int dp = AndroidUtilities.dp(30.0f) + kiVar.X1[0];
        if (!kiVar.f30103c0) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        if (f10 < dp + i9) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        vi viVar = this.f32183b3;
        viVar.f27493b.X1(viVar, 0);
    }
}
