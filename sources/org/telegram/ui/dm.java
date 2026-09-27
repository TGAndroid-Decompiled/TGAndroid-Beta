package org.telegram.ui;

import android.content.Context;
public final class dm extends org.telegram.ui.Cells.b0 {
    public final km f33004f;

    public dm(km kmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f33004f = kmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.f33004f.Q;
        int i10 = xn.Gc;
        return xnVar.R8();
    }
}
