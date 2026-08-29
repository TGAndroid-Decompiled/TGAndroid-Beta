package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ba extends ia {
    public final int F = 0;
    public final org.telegram.ui.Components.il0 G;

    public ba(ca caVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.G = caVar;
        this.f39171a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((ca) this.G).f37059c.f40145r;
            default:
                ig.f fVar = ((wo) this.G).f44340c.W2.f44915a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    public ba(wo woVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = woVar;
    }
}
