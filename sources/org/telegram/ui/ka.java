package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ka extends ra {
    public final int J = 1;
    public final org.telegram.ui.Components.vm0 K;

    public ka(la laVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.K = laVar;
        this.f41578a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((la) this.K).f39672c.f42438r;
            default:
                ci.g2 g2Var = ((jp) this.K).f39265c.Y2.f39800a;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getText().toString();
        }
    }

    public ka(jp jpVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = jpVar;
    }
}
