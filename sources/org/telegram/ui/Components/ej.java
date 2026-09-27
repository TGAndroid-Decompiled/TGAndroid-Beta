package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ej extends t61 {
    public final ij f24072f3;

    public ej(ij ijVar, Context context, int i10, d dVar, aj ajVar, aj ajVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, dVar, ajVar, ajVar2, e6Var);
        this.f24072f3 = ijVar;
    }

    @Override
    public final void D1() {
        ij ijVar = this.f24072f3;
        ijVar.f27104b.U1(ijVar, 0);
    }

    @Override
    public final boolean F0(float f7) {
        int i10;
        wi wiVar = this.f24072f3.f27104b;
        int dp = AndroidUtilities.dp(30.0f) + wiVar.f29950b2[0];
        if (!wiVar.f29965g0) {
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
        ij ijVar = this.f24072f3;
        ijVar.f27104b.U1(ijVar, 0);
    }
}
