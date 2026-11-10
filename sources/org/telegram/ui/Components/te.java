package org.telegram.ui.Components;

import android.content.Context;
public final class te extends org.telegram.ui.eg0 {
    public final Object A0;
    public final int f38294z0;

    public te(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f38294z0 = i7;
        this.A0 = obj;
    }

    @Override
    public final void l(long j3) {
        switch (this.f38294z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j3);
                return;
            default:
                ci ciVar = (ci) this.A0;
                kh khVar = ciVar.F2;
                ciVar.K2 = j3;
                khVar.setEffect(j3);
                return;
        }
    }
}
