package org.telegram.ui;

import android.content.Context;
public final class hl extends org.telegram.ui.Cells.f0 {
    public final ll L;

    public hl(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.L = llVar;
    }

    @Override
    public final int getSideMenuWidth() {
        cn cnVar = this.L.Q;
        int i7 = cn.f44408kd;
        return cnVar.m9();
    }
}
