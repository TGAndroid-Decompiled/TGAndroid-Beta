package org.telegram.ui;

import android.content.Context;
public final class il extends org.telegram.ui.Cells.a0 {
    public final ll f46687f;

    public il(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.f46687f = llVar;
    }

    @Override
    public final int getSideMenuWidth() {
        cn cnVar = this.f46687f.Q;
        int i7 = cn.f44367kd;
        return cnVar.m9();
    }
}
