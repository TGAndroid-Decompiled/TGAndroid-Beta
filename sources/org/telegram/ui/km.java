package org.telegram.ui;

import android.content.Context;
public final class km extends org.telegram.ui.Cells.b0 {
    public final rm f37459f;

    public km(rm rmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f37459f = rmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        fo foVar = this.f37459f.Q;
        int i10 = fo.Hc;
        return foVar.W8();
    }
}
