package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class gj extends m71 {
    public final kj f26721d3;

    public gj(kj kjVar, Context context, int i10, d dVar, cj cjVar, cj cjVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, cjVar, cjVar2, d6Var);
        this.f26721d3 = kjVar;
    }

    @Override
    public final void D1() {
        kj kjVar = this.f26721d3;
        kjVar.f30161b.b2(kjVar, 0);
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        yi yiVar = this.f26721d3.f30161b;
        int dp = AndroidUtilities.dp(30.0f) + yiVar.f33214e2[0];
        if (!yiVar.f33219g0) {
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
        kj kjVar = this.f26721d3;
        kjVar.f30161b.b2(kjVar, 0);
    }
}
