package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class um implements Utilities.Callback {
    public final int f28892a;
    public final xn f28893b;
    public final int f28894c;

    public um(xn xnVar, int i10, int i11) {
        this.f28892a = i11;
        this.f28893b = xnVar;
        this.f28894c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28892a) {
            case 0:
                this.f28893b.e0(this.f28894c, (qh.e) obj);
                return;
            default:
                xn xnVar = this.f28893b;
                xnVar.getClass();
                xnVar.e0(this.f28894c, new rh.e((String) obj));
                return;
        }
    }
}
