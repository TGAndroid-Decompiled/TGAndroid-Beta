package org.telegram.ui.Components;

import android.content.Context;
public final class nf extends org.telegram.ui.yi0 {
    public final int A0;
    public final Object B0;

    public nf(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
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
                wi wiVar = (wi) this.B0;
                di diVar = wiVar.I0;
                wiVar.N0 = j3;
                diVar.setEffect(j3);
                return;
        }
    }
}
