package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i6 extends s7 {
    public final int H = 1;
    public final Object I;

    public i6(au auVar, Context context, x6 x6Var) {
        super(context, x6Var, null, null);
        this.I = auVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        x6 x6Var = (x6) this.I;
        if (!z10) {
            a5Var = ((org.telegram.ui.ActionBar.h2) x6Var).simpleActionBar;
            a5Var.w();
            return;
        }
        te.a aVar = x6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        a5Var2 = ((org.telegram.ui.ActionBar.h2) x6Var).simpleActionBar;
        a5Var2.J();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((au) this.I).f39537r1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24112m, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public i6(x6 x6Var, Context context, x6 x6Var2, ri.q qVar, org.telegram.ui.Components.qt0 qt0Var) {
        super(context, x6Var2, qVar, qt0Var);
        this.I = x6Var;
    }
}
