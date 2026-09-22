package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ga extends na {
    public final int J = 0;
    public final org.telegram.ui.Components.kl0 K;

    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = haVar;
        this.f35930a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).f34207c.f36811r;
            default:
                ci.h2 h2Var = ((ip) this.K).f34703c.f34960a3.f35203a;
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
