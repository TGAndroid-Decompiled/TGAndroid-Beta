package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ja extends qa {
    public final int J = 1;
    public final org.telegram.ui.Components.xl0 K;

    public ja(ka kaVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = kaVar;
        this.f36659a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ka) this.K).f34983c.f37740r;
            default:
                ci.h2 h2Var = ((ep) this.K).f33298c.f33603a3.f33985a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ja(ep epVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = epVar;
    }
}
