package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ha extends oa {
    public final int J = 1;
    public final org.telegram.ui.Components.qm0 K;

    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = iaVar;
        this.f40492a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).f38637c.f41368r;
            default:
                ci.g2 g2Var = ((gp) this.K).f38110c.Y2.f38752a;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getText().toString();
        }
    }

    public ha(gp gpVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = gpVar;
    }
}
