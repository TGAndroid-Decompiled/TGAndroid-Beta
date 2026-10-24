package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ia extends pa {
    public final int J = 0;
    public final org.telegram.ui.Components.km0 K;

    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.K = jaVar;
        this.f40414a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).f38516c.f41331r;
            default:
                ei.e2 e2Var = ((wo) this.K).f43379c.f43653b3.f43899a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    public ia(wo woVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = woVar;
    }
}
