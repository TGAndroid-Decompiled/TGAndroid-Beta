package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class um implements Utilities.Callback {
    public final int f31399a;
    public final xn f31400b;
    public final int f31401c;

    public um(xn xnVar, int i10, int i11) {
        this.f31399a = i11;
        this.f31400b = xnVar;
        this.f31401c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31399a) {
            case 0:
                this.f31400b.e0(this.f31401c, (qh.e) obj);
                return;
            default:
                xn xnVar = this.f31400b;
                xnVar.getClass();
                xnVar.e0(this.f31401c, new rh.e((String) obj));
                return;
        }
    }
}
