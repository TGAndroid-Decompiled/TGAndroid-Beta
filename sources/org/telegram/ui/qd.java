package org.telegram.ui;

import android.content.Context;
public final class qd extends org.telegram.ui.Components.ek0 {
    public final td f51208d0;

    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, xd xdVar) {
        super(context, i6Var, xdVar);
        this.f51208d0 = tdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f51208d0.f52261x.R0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
