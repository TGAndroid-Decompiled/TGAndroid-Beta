package org.telegram.ui.Components;

import android.content.Context;
public final class df extends org.telegram.ui.eg0 {
    public final int E0;
    public final Object F0;

    public df(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.E0 = i7;
        this.F0 = obj;
    }

    @Override
    public final void m(long j3) {
        switch (this.E0) {
            case 0:
                ((ChatActivityEnterView) this.F0).setEffectId(j3);
                return;
            default:
                ui uiVar = (ui) this.F0;
                ci ciVar = uiVar.G2;
                uiVar.L2 = j3;
                ciVar.setEffect(j3);
                return;
        }
    }
}
