package org.telegram.ui.Components;

import android.content.Context;
public final class mf extends org.telegram.ui.mi0 {
    public final int A0;
    public final Object B0;

    public mf(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j10);
                return;
            default:
                ti tiVar = (ti) this.B0;
                ei eiVar = tiVar.L0;
                tiVar.Q0 = j10;
                eiVar.setEffect(j10);
                return;
        }
    }
}
