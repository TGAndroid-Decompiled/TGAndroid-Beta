package org.telegram.ui.Components;

import android.content.Context;
public final class mf extends org.telegram.ui.pi0 {
    public final Object A0;
    public final int f30531z0;

    public mf(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f30531z0 = i10;
        this.A0 = obj;
    }

    @Override
    public final void l(long j10) {
        switch (this.f30531z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                return;
            default:
                ti tiVar = (ti) this.A0;
                bi biVar = tiVar.L0;
                tiVar.Q0 = j10;
                biVar.setEffect(j10);
                return;
        }
    }
}
