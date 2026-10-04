package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class um implements Utilities.Callback {
    public final int f31398a;
    public final xn f31399b;
    public final int f31400c;

    public um(xn xnVar, int i10, int i11) {
        this.f31398a = i11;
        this.f31399b = xnVar;
        this.f31400c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31398a) {
            case 0:
                this.f31399b.e0(this.f31400c, (qh.e) obj);
                return;
            default:
                xn xnVar = this.f31399b;
                xnVar.getClass();
                xnVar.e0(this.f31400c, new rh.e((String) obj));
                return;
        }
    }
}
