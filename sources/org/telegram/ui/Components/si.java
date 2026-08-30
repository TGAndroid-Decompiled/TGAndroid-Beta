package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class si extends g61 {
    public final wi c3;

    public si(wi wiVar, Context context, int i10, d dVar, pi piVar, pi piVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, dVar, piVar, piVar2, f6Var);
        this.c3 = wiVar;
    }

    @Override
    public final void C1() {
        wi wiVar = this.c3;
        wiVar.f24278b.X1(wiVar, 0);
    }

    @Override
    public final boolean E0(float f10) {
        int i10;
        li liVar = this.c3.f24278b;
        int dp = AndroidUtilities.dp(30.0f) + liVar.Y1[0];
        if (!liVar.f26692d0) {
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
        wi wiVar = this.c3;
        wiVar.f24278b.X1(wiVar, 0);
    }
}
