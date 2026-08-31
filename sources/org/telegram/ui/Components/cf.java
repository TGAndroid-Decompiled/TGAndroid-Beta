package org.telegram.ui.Components;

import android.content.Context;
public final class cf extends org.telegram.ui.ti0 {
    public final int f25938x0;
    public final Object f25939y0;

    public cf(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.f25938x0 = i10;
        this.f25939y0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.f25938x0) {
            case 0:
                ((ChatActivityEnterView) this.f25939y0).setEffectId(j10);
                return;
            default:
                mi miVar = (mi) this.f25939y0;
                vh vhVar = miVar.F0;
                miVar.K0 = j10;
                vhVar.setEffect(j10);
                return;
        }
    }
}
