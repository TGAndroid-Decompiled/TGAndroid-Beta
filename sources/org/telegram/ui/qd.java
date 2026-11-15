package org.telegram.ui;

import android.content.Context;
public final class qd extends org.telegram.ui.Components.wj0 {
    public final td f50591d0;

    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, xd xdVar) {
        super(context, e6Var, xdVar);
        this.f50591d0 = tdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f50591d0.f51563x.R0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
