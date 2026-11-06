package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i6 extends t7 {
    public final int G = 1;
    public final Object H;

    public i6(wt wtVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.H = wtVar;
    }

    public void f(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        y6 y6Var = (y6) this.H;
        if (!z9) {
            y4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
            y4Var.r();
            return;
        }
        te.a aVar = y6Var.S;
        if (aVar != null) {
            aVar.a(true, true);
        }
        y4Var2 = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
        y4Var2.B();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((wt) this.H).n1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22538m, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public i6(y6 y6Var, Context context, y6 y6Var2, oi.q qVar, org.telegram.ui.Components.ht0 ht0Var) {
        super(context, y6Var2, qVar, ht0Var);
        this.H = y6Var;
    }
}
