package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int J = 0;
    public final org.telegram.ui.Components.oj0 K;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, h6Var);
        this.K = eaVar;
        this.f46587a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ea) this.K).f45218c.f47561r;
            default:
                ah.i iVar = ((go) this.K).f46137c.f46402h3.f46683b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(go goVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.K = goVar;
    }
}
