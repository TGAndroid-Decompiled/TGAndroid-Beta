package org.telegram.ui.Components;

import android.content.Context;
public final class rf extends org.telegram.ui.ej0 {
    public final int A0;
    public final Object B0;

    public rf(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override
    public final void m(long j3) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j3);
                return;
            default:
                aj ajVar = (aj) this.B0;
                ki kiVar = ajVar.L0;
                ajVar.Q0 = j3;
                kiVar.setEffect(j3);
                return;
        }
    }
}
