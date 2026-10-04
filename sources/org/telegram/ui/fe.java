package org.telegram.ui;

import android.content.Context;
public final class fe extends org.telegram.ui.Components.bm0 {
    public final ie f36282c0;

    public fe(ie ieVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, me meVar) {
        super(context, d6Var, meVar);
        this.f36282c0 = ieVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.f36282c0.f37413w.T1 && super.canScrollHorizontally(i10)) {
            return true;
        }
        return false;
    }
}
