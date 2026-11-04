package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ca extends ha {
    public final int K = 0;
    public final org.telegram.ui.Components.sj0 L;

    public ca(da daVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.L = daVar;
        this.f45869a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((da) this.L).f44609c.f46844r;
            default:
                bh.g gVar = ((zn) this.L).f52716c.i3.f44090b;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    public ca(zn znVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = znVar;
    }
}
