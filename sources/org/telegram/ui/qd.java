package org.telegram.ui;

import android.content.Context;
public final class qd extends org.telegram.ui.Components.vj0 {
    public final td f48863d0;

    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, xd xdVar) {
        super(context, e6Var, xdVar);
        this.f48863d0 = tdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i3) {
        if (this.f48863d0.f49784x.R0 && super.canScrollHorizontally(i3)) {
            return true;
        }
        return false;
    }
}
