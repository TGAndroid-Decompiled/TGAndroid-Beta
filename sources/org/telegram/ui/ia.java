package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ia extends pa {
    public final int J = 1;
    public final org.telegram.ui.Components.ll0 K;

    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = jaVar;
        this.f36575a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).f34831c.f37439r;
            default:
                ci.h2 h2Var = ((ip) this.K).f34645c.f34921a3.f35322a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ia(ip ipVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = ipVar;
    }
}
