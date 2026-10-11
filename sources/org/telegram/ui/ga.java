package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ga extends na {
    public final int J = 1;
    public final org.telegram.ui.Components.rm0 K;

    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = haVar;
        this.f40167a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).f38362c.f41084r;
            default:
                ci.g2 g2Var = ((gp) this.K).f38148c.Y2.f38735a;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getText().toString();
        }
    }

    public ga(gp gpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = gpVar;
    }
}
