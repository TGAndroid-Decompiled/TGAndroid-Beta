package org.telegram.ui.Components;

import android.content.Context;
public final class nf extends org.telegram.ui.vi0 {
    public final int A0;
    public final Object B0;

    public nf(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
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
                wi wiVar = (wi) this.B0;
                gi giVar = wiVar.I0;
                wiVar.N0 = j3;
                giVar.setEffect(j3);
                return;
        }
    }
}
