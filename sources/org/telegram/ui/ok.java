package org.telegram.ui;

import android.content.Context;
public final class ok extends wg.e {
    public final xn I;

    public ok(xn xnVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, fj fjVar, ng.a aVar) {
        super(context, aVar, f6Var, fjVar);
        this.I = xnVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        super.setVisibility(i10);
        h5.u uVar = this.I.f40260yc;
        boolean z10 = false;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getMeasuredWidth() > 0) {
            z10 = true;
        }
        uVar.h(3, z4, z10);
    }
}
