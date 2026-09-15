package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ga extends na {
    public final int J = 0;
    public final org.telegram.ui.Components.kl0 K;

    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = haVar;
        this.f35920a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).f34222c.f36821r;
            default:
                ci.h2 h2Var = ((ip) this.K).f34718c.f34947a3.f35210a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ga(ip ipVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = ipVar;
    }
}
