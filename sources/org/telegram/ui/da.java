package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int K = 0;
    public final org.telegram.ui.Components.dk0 L;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, h6Var);
        this.L = eaVar;
        this.f48695a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((ea) this.L).f47210c.f49533r;
            default:
                ah.i iVar = ((ho) this.L).f48500c.f48794i3.f49030b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(ho hoVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.L = hoVar;
    }
}
