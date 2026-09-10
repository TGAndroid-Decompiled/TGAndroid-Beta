package org.telegram.ui.Components;

import android.content.Context;
public final class of extends org.telegram.ui.cj0 {
    public final int A0;
    public final Object B0;

    public of(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
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
                yi yiVar = (yi) this.B0;
                ii iiVar = yiVar.I0;
                yiVar.N0 = j3;
                iiVar.setEffect(j3);
                return;
        }
    }
}
