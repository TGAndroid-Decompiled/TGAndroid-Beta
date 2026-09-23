package org.telegram.ui;

import android.content.Context;
public final class dm extends org.telegram.ui.Cells.b0 {
    public final km f32682f;

    public dm(km kmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f32682f = kmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        xn xnVar = this.f32682f.Q;
        int i10 = xn.Gc;
        return xnVar.R8();
    }
}
