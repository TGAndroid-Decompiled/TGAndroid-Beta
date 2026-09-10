package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class fj extends r61 {
    public final jj f23023f3;

    public fj(jj jjVar, Context context, int i10, e eVar, cj cjVar, cj cjVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, eVar, cjVar, cjVar2, f6Var);
        this.f23023f3 = jjVar;
    }

    @Override
    public final void B1() {
        jj jjVar = this.f23023f3;
        jjVar.f26422b.X1(jjVar, 0);
    }

    @Override
    public final boolean E0(float f7) {
        int i10;
        yi yiVar = this.f23023f3.f26422b;
        int dp = AndroidUtilities.dp(30.0f) + yiVar.f29354b2[0];
        if (!yiVar.f29369g0) {
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
        jj jjVar = this.f23023f3;
        jjVar.f26422b.X1(jjVar, 0);
    }
}
