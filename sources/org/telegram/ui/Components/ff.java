package org.telegram.ui.Components;

import android.content.Context;
public final class ff extends org.telegram.ui.ki0 {
    public final int f28388w0;
    public final Object f28389x0;

    public ff(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f28388w0 = i10;
        this.f28389x0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.f28388w0) {
            case 0:
                ((ChatActivityEnterView) this.f28389x0).setEffectId(j10);
                return;
            default:
                ni niVar = (ni) this.f28389x0;
                yh yhVar = niVar.E0;
                niVar.J0 = j10;
                yhVar.setEffect(j10);
                return;
        }
    }
}
