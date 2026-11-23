package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j6 extends t7 {
    public final int H = 0;
    public final Object I;

    public j6(zt ztVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.I = ztVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        y6 y6Var = (y6) this.I;
        if (!z10) {
            z4Var = ((org.telegram.ui.ActionBar.g2) y6Var).simpleActionBar;
            z4Var.w();
            return;
        }
        te.a aVar = y6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        z4Var2 = ((org.telegram.ui.ActionBar.g2) y6Var).simpleActionBar;
        z4Var2.I();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((zt) this.I).f39249r1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24220m, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j6(y6 y6Var, Context context, y6 y6Var2, ri.q qVar, org.telegram.ui.Components.st0 st0Var) {
        super(context, y6Var2, qVar, st0Var);
        this.I = y6Var;
    }
}
