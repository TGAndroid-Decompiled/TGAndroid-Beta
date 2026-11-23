package org.telegram.ui;

import android.content.Context;
public final class qd extends org.telegram.ui.Components.gk0 {
    public final td f51258d0;

    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, xd xdVar) {
        super(context, h6Var, xdVar);
        this.f51258d0 = tdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f51258d0.f52315x.R0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
