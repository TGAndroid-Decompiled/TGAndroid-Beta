package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int J = 0;
    public final org.telegram.ui.Components.oj0 K;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = eaVar;
        this.f46616a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ea) this.K).f45247c.f47487r;
            default:
                ah.i iVar = ((eo) this.K).f45390c.f45682h3.f46047b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(eo eoVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = eoVar;
    }
}
