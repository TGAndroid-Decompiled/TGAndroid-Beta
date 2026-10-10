package org.telegram.ui;

import android.content.Context;
public final class fm extends org.telegram.ui.Cells.b0 {
    public final mm f37686f;

    public fm(mm mmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f37686f = mmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.f37686f.Q;
        int i10 = zn.Hc;
        return znVar.W8();
    }
}
