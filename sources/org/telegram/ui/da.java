package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int K = 0;
    public final org.telegram.ui.Components.dk0 L;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, h6Var);
        this.L = eaVar;
        this.f48699a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((ea) this.L).f47214c.f49537r;
            default:
                ah.i iVar = ((ho) this.L).f48504c.f48798i3.f49034b;
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
