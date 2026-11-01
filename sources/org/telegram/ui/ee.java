package org.telegram.ui;

import android.content.Context;
public final class ee extends org.telegram.ui.Components.wk0 {
    public final he f36808c0;

    public ee(he heVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, le leVar) {
        super(context, p6Var, leVar);
        this.f36808c0 = heVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.f36808c0.f37803x.Q0 && super.canScrollHorizontally(i10)) {
            return true;
        }
        return false;
    }
}
