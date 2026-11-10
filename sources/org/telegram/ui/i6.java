package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i6 extends t7 {
    public final int G = 0;
    public final Object H;

    public i6(zt ztVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.H = ztVar;
    }

    public void f(boolean z9) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        y6 y6Var = (y6) this.H;
        if (!z9) {
            z4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
            z4Var.t();
            return;
        }
        te.a aVar = y6Var.S;
        if (aVar != null) {
            aVar.a(true, true);
        }
        z4Var2 = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
        z4Var2.D();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((zt) this.H).f35904q1 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22561m, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public i6(y6 y6Var, Context context, y6 y6Var2, oi.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context, y6Var2, qVar, it0Var);
        this.H = y6Var;
    }
}
