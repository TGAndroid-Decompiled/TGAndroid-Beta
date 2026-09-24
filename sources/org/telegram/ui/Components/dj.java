package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends r61 {
    public final hj f23609f3;

    public dj(hj hjVar, Context context, int i10, d dVar, aj ajVar, aj ajVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, ajVar, ajVar2, d6Var);
        this.f23609f3 = hjVar;
    }

    @Override
    public final void C1() {
        hj hjVar = this.f23609f3;
        hjVar.f27083b.X1(hjVar, 0);
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        wi wiVar = this.f23609f3.f27083b;
        int dp = AndroidUtilities.dp(30.0f) + wiVar.f29973b2[0];
        if (!wiVar.f29988g0) {
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
        hj hjVar = this.f23609f3;
        hjVar.f27083b.X1(hjVar, 0);
    }
}
