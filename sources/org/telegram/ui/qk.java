package org.telegram.ui;

import android.content.Context;
public final class qk extends wg.e {
    public final zn I;

    public qk(zn znVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, hj hjVar, ng.a aVar) {
        super(context, aVar, f6Var, hjVar);
        this.I = znVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        super.setVisibility(i10);
        h5.u uVar = this.I.f40826yc;
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
