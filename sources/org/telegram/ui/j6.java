package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j6 extends t7 {
    public final int H = 0;
    public final Object I;

    public j6(yt ytVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.I = ytVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        y6 y6Var = (y6) this.I;
        if (!z10) {
            w4Var = ((org.telegram.ui.ActionBar.e2) y6Var).simpleActionBar;
            w4Var.u();
            return;
        }
        te.a aVar = y6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        w4Var2 = ((org.telegram.ui.ActionBar.e2) y6Var).simpleActionBar;
        w4Var2.F();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((yt) this.I).f35934r1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j6(y6 y6Var, Context context, y6 y6Var2, ri.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context, y6Var2, qVar, it0Var);
        this.I = y6Var;
    }
}
