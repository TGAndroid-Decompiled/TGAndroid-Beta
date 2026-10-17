package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ka extends ra {
    public final int J = 0;
    public final org.telegram.ui.Components.hm0 K;

    public ka(la laVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = laVar;
        this.f40672a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((la) this.K).f38839c.f41936r;
            default:
                ei.e2 e2Var = ((wo) this.K).f42901c.Y2.f43435a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    public ka(wo woVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = woVar;
    }
}
