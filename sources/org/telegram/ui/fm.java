package org.telegram.ui;

import android.content.Context;
public final class fm extends org.telegram.ui.Cells.b0 {
    public final mm f37747f;

    public fm(mm mmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f37747f = mmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.f37747f.Q;
        int i10 = zn.Hc;
        return znVar.W8();
    }
}
