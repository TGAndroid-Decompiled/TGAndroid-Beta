package org.telegram.ui.Components;

import android.content.Context;
public final class cf extends org.telegram.ui.si0 {
    public final int f23980x0;
    public final Object f23981y0;

    public cf(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.f23980x0 = i10;
        this.f23981y0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.f23980x0) {
            case 0:
                ((ChatActivityEnterView) this.f23981y0).setEffectId(j10);
                return;
            default:
                li liVar = (li) this.f23981y0;
                vh vhVar = liVar.F0;
                liVar.K0 = j10;
                vhVar.setEffect(j10);
                return;
        }
    }
}
