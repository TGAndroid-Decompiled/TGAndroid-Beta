package org.telegram.ui.Components;

import android.content.Context;
public final class of extends org.telegram.ui.zi0 {
    public final int A0;
    public final Object B0;

    public of(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
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
                xi xiVar = (xi) this.B0;
                ei eiVar = xiVar.I0;
                xiVar.N0 = j3;
                eiVar.setEffect(j3);
                return;
        }
    }
}
