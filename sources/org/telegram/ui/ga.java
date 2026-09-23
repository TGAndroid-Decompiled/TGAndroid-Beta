package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ga extends na {
    public final int J = 1;
    public final org.telegram.ui.Components.ll0 K;

    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = haVar;
        this.f35463a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).f33792c.f36340r;
            default:
                ci.h2 h2Var = ((ep) this.K).f32994c.f33354a3.f33603a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ga(ep epVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = epVar;
    }
}
