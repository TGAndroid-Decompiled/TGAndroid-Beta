package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ga extends na {
    public final int J = 1;
    public final org.telegram.ui.Components.yl0 K;

    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = haVar;
        this.f35890a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).f34264c.f36935r;
            default:
                ci.h2 h2Var = ((dp) this.K).f33250c.f33538h3.f33851a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ga(dp dpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = dpVar;
    }
}
