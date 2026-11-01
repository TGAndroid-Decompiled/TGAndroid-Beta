package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class fa extends la {
    public final int J = 1;
    public final org.telegram.ui.Components.tk0 K;

    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, p6Var);
        this.K = gaVar;
        this.f39157a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ga) this.K).f37437c.f40115r;
            default:
                org.telegram.ui.ActionBar.n0 n0Var = ((ap) this.K).f35820c.f36095h3.f36359b;
                if (n0Var == null) {
                    return null;
                }
                return n0Var.getText().toString();
        }
    }

    public fa(ap apVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.K = apVar;
    }
}
