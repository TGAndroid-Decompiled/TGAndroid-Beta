package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class la extends sa {
    public final int J = 1;
    public final org.telegram.ui.Components.lm0 K;

    public la(ma maVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.K = maVar;
        this.f39736a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ma) this.K).f37942c.f40627r;
            default:
                di.g2 g2Var = ((lp) this.K).f37801c.Y2.f38432a;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getText().toString();
        }
    }

    public la(lp lpVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = lpVar;
    }
}
