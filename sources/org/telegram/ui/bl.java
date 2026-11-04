package org.telegram.ui;

import android.content.Context;
public final class bl extends org.telegram.ui.Cells.f0 {
    public final fl M;

    public bl(fl flVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.M = flVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wm wmVar = this.M.R;
        int i3 = wm.f51227jd;
        return wmVar.l9();
    }
}
