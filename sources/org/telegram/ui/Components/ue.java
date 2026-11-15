package org.telegram.ui.Components;

import android.content.Context;
public final class ue extends org.telegram.ui.bg0 {
    public final int E0;
    public final Object F0;

    public ue(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
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
                ki kiVar = (ki) this.F0;
                sh shVar = kiVar.G2;
                kiVar.L2 = j3;
                shVar.setEffect(j3);
                return;
        }
    }
}
