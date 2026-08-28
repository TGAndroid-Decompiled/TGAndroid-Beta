package org.telegram.ui.Components;

import android.content.Context;
public final class cf extends org.telegram.ui.li0 {
    public final int f27472w0;
    public final Object f27473x0;

    public cf(Object obj, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.f27472w0 = i9;
        this.f27473x0 = obj;
    }

    @Override
    public final void m(long j10) {
        switch (this.f27472w0) {
            case 0:
                ((ChatActivityEnterView) this.f27473x0).setEffectId(j10);
                return;
            default:
                ki kiVar = (ki) this.f27473x0;
                vh vhVar = kiVar.E0;
                kiVar.J0 = j10;
                vhVar.setEffect(j10);
                return;
        }
    }
}
