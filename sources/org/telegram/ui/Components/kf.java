package org.telegram.ui.Components;

import android.content.Context;
public final class kf extends org.telegram.ui.pi0 {
    public final Object A0;
    public final int f28011z0;

    public kf(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.f28011z0 = i10;
        this.A0 = obj;
    }

    @Override
    public final void l(long j10) {
        switch (this.f28011z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                return;
            default:
                ri riVar = (ri) this.A0;
                ci ciVar = riVar.L0;
                riVar.Q0 = j10;
                ciVar.setEffect(j10);
                return;
        }
    }
}
