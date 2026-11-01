package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j6 extends t7 {
    public final int G = 0;
    public final Object H;

    public j6(yu yuVar, Context context, y6 y6Var) {
        super(context, y6Var, null, null);
        this.H = yuVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        y6 y6Var = (y6) this.H;
        if (!z10) {
            i5Var = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
            i5Var.r();
            return;
        }
        fe.b bVar = y6Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        i5Var2 = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
        i5Var2.C();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((yu) this.H).f26726n1 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16166m, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j6(y6 y6Var, Context context, y6 y6Var2, ei.r rVar, org.telegram.ui.Components.lu0 lu0Var) {
        super(context, y6Var2, rVar, lu0Var);
        this.H = y6Var;
    }
}
