package org.telegram.ui;

import android.content.Context;
public final class ik extends ug.e {
    public final tn H;

    public ik(tn tnVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar, lg.a aVar) {
        super(context, aVar, ajVar, c6Var);
        this.H = tnVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        f5.u uVar = this.H.f43036xc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        uVar.j(3, z10, z11);
    }
}
