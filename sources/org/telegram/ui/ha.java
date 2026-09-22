package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ha extends oa {
    public final int J = 1;
    public final org.telegram.ui.Components.xl0 K;

    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = iaVar;
        this.f36242a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).f34534c.f37106r;
            default:
                ci.h2 h2Var = ((gp) this.K).f33962c.f34270a3.f34654a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    public ha(gp gpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = gpVar;
    }
}
