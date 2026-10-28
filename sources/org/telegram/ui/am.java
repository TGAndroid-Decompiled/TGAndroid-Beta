package org.telegram.ui;

import android.content.Context;
public final class am extends org.telegram.ui.Cells.a0 {
    public final hm f37798f;

    public am(hm hmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f37798f = hmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wn wnVar = this.f37798f.Q;
        int i10 = wn.f45035fd;
        return wnVar.e9();
    }
}
