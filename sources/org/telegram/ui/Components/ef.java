package org.telegram.ui.Components;

import android.content.Context;
public final class ef extends org.telegram.ui.dg0 {
    public final int E0;
    public final Object F0;

    public ef(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.E0 = i7;
        this.F0 = obj;
    }

    @Override
    public final void m(long j3) {
        switch (this.E0) {
            case 0:
                ((ChatActivityEnterView) this.F0).setEffectId(j3);
                return;
            default:
                ti tiVar = (ti) this.F0;
                bi biVar = tiVar.G2;
                tiVar.L2 = j3;
                biVar.setEffect(j3);
                return;
        }
    }
}
