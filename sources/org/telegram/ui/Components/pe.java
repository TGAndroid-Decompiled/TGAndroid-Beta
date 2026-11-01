package org.telegram.ui.Components;

import android.content.Context;
public final class pe extends org.telegram.ui.ih0 {
    public final Object A0;
    public final int f29409z0;

    public pe(Object obj, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f29409z0 = i10;
        this.A0 = obj;
    }

    @Override
    public final void l(long j10) {
        switch (this.f29409z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                return;
            default:
                bi biVar = (bi) this.A0;
                ih ihVar = biVar.C2;
                biVar.H2 = j10;
                ihVar.setEffect(j10);
                return;
        }
    }
}
