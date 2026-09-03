package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class fa extends ma {
    public final int G = 1;
    public final org.telegram.ui.Components.rl0 H;

    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.H = gaVar;
        this.f38896a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ga) this.H).f37045c.f39957r;
            default:
                lg.f fVar = ((bp) this.H).f35584c.X2.f36536a;
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
