package org.telegram.ui;

import android.content.Context;
public final class de extends org.telegram.ui.Components.pm0 {
    public final ge f38592c0;

    public de(ge geVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, ke keVar) {
        super(context, u6Var, keVar);
        this.f38592c0 = geVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.f38592c0.f39603w.Q0 && super.canScrollHorizontally(i10)) {
            return true;
        }
        return false;
    }
}
