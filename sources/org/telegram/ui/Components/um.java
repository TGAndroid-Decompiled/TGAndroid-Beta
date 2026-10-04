package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class um implements Utilities.Callback {
    public final int f31405a;
    public final xn f31406b;
    public final int f31407c;

    public um(xn xnVar, int i10, int i11) {
        this.f31405a = i11;
        this.f31406b = xnVar;
        this.f31407c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31405a) {
            case 0:
                this.f31406b.e0(this.f31407c, (qh.e) obj);
                return;
            default:
                xn xnVar = this.f31406b;
                xnVar.getClass();
                xnVar.e0(this.f31407c, new rh.e((String) obj));
                return;
        }
    }
}
