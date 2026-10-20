package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ia extends pa {
    public final int J = 0;
    public final org.telegram.ui.Components.im0 K;

    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = jaVar;
        this.f40162a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).f38219c.f41416r;
            default:
                ei.e2 e2Var = ((uo) this.K).f42022c.Y2.f42906a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    public ia(uo uoVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = uoVar;
    }
}
