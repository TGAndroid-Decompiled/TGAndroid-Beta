package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends u51 {
    public final yi f33242b3;

    public ui(yi yiVar, Context context, int i10, d dVar, ri riVar, ri riVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, riVar, riVar2, c6Var);
        this.f33242b3 = yiVar;
    }

    @Override
    public final void C1() {
        yi yiVar = this.f33242b3;
        yiVar.f28403b.X1(yiVar, 0);
    }

    @Override
    public final boolean E0(float f9) {
        int i10;
        ni niVar = this.f33242b3.f28403b;
        int dp = AndroidUtilities.dp(30.0f) + niVar.X1[0];
        if (!niVar.f30994c0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        if (f9 < dp + i10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        yi yiVar = this.f33242b3;
        yiVar.f28403b.X1(yiVar, 0);
    }
}
