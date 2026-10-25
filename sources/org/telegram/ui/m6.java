package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m6 extends x7 {
    public final int G = 0;
    public final Object H;

    public m6(vu vuVar, Context context, c7 c7Var) {
        super(context, c7Var, null, null);
        this.H = vuVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        c7 c7Var = (c7) this.H;
        if (!z10) {
            r5Var = ((org.telegram.ui.ActionBar.r2) c7Var).simpleActionBar;
            r5Var.n();
            return;
        }
        oe.b bVar = c7Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        r5Var2 = ((org.telegram.ui.ActionBar.r2) c7Var).simpleActionBar;
        r5Var2.x();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((vu) this.H).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public m6(c7 c7Var, Context context, c7 c7Var2, oi.q qVar, org.telegram.ui.Components.lw0 lw0Var) {
        super(context, c7Var2, qVar, lw0Var);
        this.H = c7Var;
    }
}
