package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

public final class da extends ka {
    public final int F = 0;
    public final org.telegram.ui.Components.yk0 G;

    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.G = eaVar;
        this.f39669a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((ea) this.G).f37689c.f40706r;
            default:
                gg.g gVar = ((vo) this.G).f43494c.W2.f44548a;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    public da(vo voVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = voVar;
    }
}
