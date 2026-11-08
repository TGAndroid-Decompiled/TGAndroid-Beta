package org.telegram.ui.Components;

import android.content.Context;
public final class ue extends org.telegram.ui.bg0 {
    public final Object A0;
    public final int f38620z0;

    public ue(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f38620z0 = i7;
        this.A0 = obj;
    }

    @Override
    public final void l(long j3) {
        switch (this.f38620z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j3);
                return;
            default:
                di diVar = (di) this.A0;
                lh lhVar = diVar.C2;
                diVar.H2 = j3;
                lhVar.setEffect(j3);
                return;
        }
    }
}
