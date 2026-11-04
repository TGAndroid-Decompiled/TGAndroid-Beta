package org.telegram.ui.Components;

import android.content.Context;
public final class se extends org.telegram.ui.vf0 {
    public final int A0;
    public final Object B0;

    public se(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.A0 = i3;
        this.B0 = obj;
    }

    @Override
    public final void l(long j10) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j10);
                return;
            default:
                bi biVar = (bi) this.B0;
                ih ihVar = biVar.D2;
                biVar.I2 = j10;
                ihVar.setEffect(j10);
                return;
        }
    }
}
