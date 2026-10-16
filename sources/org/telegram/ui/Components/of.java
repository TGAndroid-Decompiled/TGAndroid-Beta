package org.telegram.ui.Components;

import android.content.Context;
public final class of extends org.telegram.ui.gj0 {
    public final int A0;
    public final Object B0;

    public of(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
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
                vi viVar = (vi) this.B0;
                fi fiVar = viVar.L0;
                viVar.Q0 = j10;
                fiVar.setEffect(j10);
                return;
        }
    }
}
