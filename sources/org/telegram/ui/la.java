package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class la extends sa {
    public final int J = 1;
    public final org.telegram.ui.Components.lm0 K;

    public la(ma maVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.K = maVar;
        this.f40012a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ma) this.K).f38196c.f40940r;
            default:
                di.g2 g2Var = ((lp) this.K).f38062c.Y2.f38752a;
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
