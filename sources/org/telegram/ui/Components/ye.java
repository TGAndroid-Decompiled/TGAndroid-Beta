package org.telegram.ui.Components;

import android.content.Context;

public final class ye extends org.telegram.ui.ni0 {

    public final int f34885w0;

    public final Object f34886x0;

    public ye(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f34885w0 = i10;
        this.f34886x0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.f34885w0) {
            case 0:
                ((ChatActivityEnterView) this.f34886x0).setEffectId(j10);
                break;
            default:
                gi giVar = (gi) this.f34886x0;
                rh rhVar = giVar.E0;
                giVar.J0 = j10;
                rhVar.setEffect(j10);
                break;
        }
    }
}
