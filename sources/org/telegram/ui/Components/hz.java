package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class hz extends ux0 {
    public final int f25432x3;
    public final iz y3;

    public hz(iz izVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.y3 = izVar;
        this.f25432x3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        ix ixVar;
        zx zxVar;
        super.F1(i10);
        iz izVar = this.y3;
        wz wzVar = izVar.G;
        hz hzVar = izVar.f25825r;
        boolean z11 = true;
        if (hzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = wz.O2;
        wzVar.M(z10);
        int i12 = this.f25432x3;
        if (i12 == 1 && (zxVar = wzVar.I) != null) {
            if (hzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            zxVar.n(z11);
        } else if (i12 == 0 && (ixVar = wzVar.B0) != null) {
            if (hzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            ixVar.f26437o0 = z11;
            ixVar.invalidate();
        }
        izVar.g(false);
    }
}
