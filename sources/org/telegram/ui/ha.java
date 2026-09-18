package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ha extends oa {
    public final int J = 1;
    public final org.telegram.ui.Components.vl0 K;

    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = iaVar;
        this.f36142a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).f34477c.f37006r;
            default:
                ci.h2 h2Var = ((gp) this.K).f33910c.f34202a3.f34570a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ha(gp gpVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = gpVar;
    }
}
