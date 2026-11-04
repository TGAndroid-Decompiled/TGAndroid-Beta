package org.telegram.ui;

import android.content.Context;
public final class cl extends org.telegram.ui.Cells.a0 {
    public final fl f44384f;

    public cl(fl flVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.f44384f = flVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wm wmVar = this.f44384f.R;
        int i3 = wm.f51227jd;
        return wmVar.l9();
    }
}
