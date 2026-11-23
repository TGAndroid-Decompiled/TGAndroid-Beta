package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int K = 0;
    public final org.telegram.ui.Components.dk0 L;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, i6Var);
        this.L = eaVar;
        this.f48754a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((ea) this.L).f47482c.f49666r;
            default:
                ah.i iVar = ((go) this.L).f48337c.f48602i3.f48863b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(go goVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = goVar;
    }
}
