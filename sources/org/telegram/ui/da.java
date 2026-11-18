package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class da extends ia {
    public final int K = 0;
    public final org.telegram.ui.Components.bk0 L;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, i6Var);
        this.L = eaVar;
        this.f48665a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((ea) this.L).f47141c.f49493r;
            default:
                ah.i iVar = ((ho) this.L).f48457c.f48772i3.f48997b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    public da(ho hoVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = hoVar;
    }
}
