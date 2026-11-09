package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int J = 0;
    public final org.telegram.ui.Components.pj0 K;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.K = eaVar;
        this.f46536a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ea) this.K).f45343c.f47544r;
            default:
                ah.i iVar = ((go) this.K).f46049c.f46362h3.f46710b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(go goVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = goVar;
    }
}
