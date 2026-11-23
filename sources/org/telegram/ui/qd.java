package org.telegram.ui;

import android.content.Context;
public final class qd extends org.telegram.ui.Components.gk0 {
    public final td f51443d0;

    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, xd xdVar) {
        super(context, i6Var, xdVar);
        this.f51443d0 = tdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f51443d0.f52371x.R0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
