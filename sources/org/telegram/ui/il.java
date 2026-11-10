package org.telegram.ui;

import android.content.Context;
public final class il extends org.telegram.ui.Cells.a0 {
    public final ll f46660f;

    public il(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f46660f = llVar;
    }

    @Override
    public final int getSideMenuWidth() {
        cn cnVar = this.f46660f.Q;
        int i7 = cn.f44408kd;
        return cnVar.m9();
    }
}
