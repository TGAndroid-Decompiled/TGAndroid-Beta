package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class fa extends ma {
    public final int G = 1;
    public final org.telegram.ui.Components.rl0 H;

    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.H = gaVar;
        this.f36244a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ga) this.H).f34523c.f37256r;
            default:
                kg.f fVar = ((bp) this.H).f32996c.X2.f33746a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    public fa(bp bpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = bpVar;
    }
}
