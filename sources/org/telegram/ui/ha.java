package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ha extends oa {
    public final int J = 0;
    public final org.telegram.ui.Components.ul0 K;

    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = iaVar;
        this.f35435a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).f33597c.f36277r;
            default:
                bi.t2 t2Var = ((kp) this.K).f34434c.f34749a3.f35015a;
                if (t2Var == null) {
                    return null;
                }
                return t2Var.getText().toString();
        }
    }

    public ha(kp kpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = kpVar;
    }
}
