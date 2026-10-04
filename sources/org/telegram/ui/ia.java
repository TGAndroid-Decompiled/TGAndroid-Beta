package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ia extends pa {
    public final int J = 1;
    public final org.telegram.ui.Components.yl0 K;

    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = jaVar;
        this.f39417a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).f37619c.f40434r;
            default:
                ci.h2 h2Var = ((fp) this.K).f36361c.f36701h3.f37130a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ia(fp fpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = fpVar;
    }
}
