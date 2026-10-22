package org.telegram.ui.Components;

import android.content.Context;
public final class mf extends org.telegram.ui.mi0 {
    public final Object A0;
    public final int f28512z0;

    public mf(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f28512z0 = i10;
        this.A0 = obj;
    }

    @Override
    public final void l(long j10) {
        switch (this.f28512z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                return;
            default:
                ti tiVar = (ti) this.A0;
                ei eiVar = tiVar.L0;
                tiVar.Q0 = j10;
                eiVar.setEffect(j10);
                return;
        }
    }
}
