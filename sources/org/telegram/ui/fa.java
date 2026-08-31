package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class fa extends ma {
    public final int G = 1;
    public final org.telegram.ui.Components.sl0 H;

    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.H = gaVar;
        this.f39025a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ga) this.H).f37140c.f39997r;
            default:
                lg.f fVar = ((bp) this.H).f35573c.X2.f36629a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    public fa(bp bpVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = bpVar;
    }
}
