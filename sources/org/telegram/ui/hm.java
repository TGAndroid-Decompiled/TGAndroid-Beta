package org.telegram.ui;

import android.content.Context;
public final class hm extends org.telegram.ui.Cells.b0 {
    public final om f37092f;

    public hm(om omVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f37092f = omVar;
    }

    @Override
    public final int getSideMenuWidth() {
        co coVar = this.f37092f.Q;
        int i10 = co.Hc;
        return coVar.R8();
    }
}
