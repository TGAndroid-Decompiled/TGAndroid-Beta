package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ja extends qa {
    public final int J = 0;
    public final org.telegram.ui.Components.lm0 K;

    public ja(ka kaVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, u6Var);
        this.K = kaVar;
        this.f42784a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ka) this.K).f40868c.f43712r;
            default:
                fi.c2 c2Var = ((yo) this.K).f46088c.f46341i3.f37846b;
                if (c2Var == null) {
                    return null;
                }
                return c2Var.getText().toString();
        }
    }

    public ja(yo yoVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = yoVar;
    }
}
