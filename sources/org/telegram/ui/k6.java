package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k6 extends v7 {
    public final int F = 0;
    public final Object G;

    public k6(jv jvVar, Context context, a7 a7Var) {
        super(context, a7Var, null, null);
        this.G = jvVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        a7 a7Var = (a7) this.G;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
            kVar.r();
            return;
        }
        le.b bVar = a7Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
        kVar2.M(null, null);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((jv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k6(a7 a7Var, Context context, a7 a7Var2, li.n nVar, org.telegram.ui.Components.aw0 aw0Var) {
        super(context, a7Var2, nVar, aw0Var);
        this.G = a7Var;
    }
}
