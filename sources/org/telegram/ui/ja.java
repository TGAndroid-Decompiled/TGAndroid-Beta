package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ja extends qa {
    public final int J = 1;
    public final org.telegram.ui.Components.mm0 K;

    public ja(ka kaVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, u6Var);
        this.K = kaVar;
        this.f42649a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ka) this.K).f40716c.f43581r;
            default:
                fi.c2 c2Var = ((ap) this.K).f37805c.f38083i3.f38403b;
                if (c2Var == null) {
                    return null;
                }
                return c2Var.getText().toString();
        }
    }

    public ja(ap apVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = apVar;
    }
}
