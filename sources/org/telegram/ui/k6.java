package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k6 extends u7 {
    public final int H = 1;
    public final Object I;

    public k6(ut utVar, Context context, z6 z6Var) {
        super(context, z6Var, null, null);
        this.I = utVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        z6 z6Var = (z6) this.I;
        if (!z10) {
            y4Var = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
            y4Var.r();
            return;
        }
        qe.a aVar = z6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        y4Var2 = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
        y4Var2.B();
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((((ut) this.I).f36104o1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m, 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public k6(z6 z6Var, Context context, z6 z6Var2, pi.q qVar, org.telegram.ui.Components.gt0 gt0Var) {
        super(context, z6Var2, qVar, gt0Var);
        this.I = z6Var;
    }
}
