package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class fj extends u61 {
    public final jj f24299m3;

    public fj(jj jjVar, Context context, int i10, d dVar, bj bjVar, bj bjVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, bjVar, bjVar2, d6Var);
        this.f24299m3 = jjVar;
    }

    @Override
    public final void E1() {
        jj jjVar = this.f24299m3;
        jjVar.f27362b.X1(jjVar, 0);
    }

    @Override
    public final boolean F0(float f7) {
        int i10;
        xi xiVar = this.f24299m3.f27362b;
        int dp = AndroidUtilities.dp(30.0f) + xiVar.f30258b2[0];
        if (!xiVar.f30273g0) {
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
        jj jjVar = this.f24299m3;
        jjVar.f27362b.X1(jjVar, 0);
    }
}
