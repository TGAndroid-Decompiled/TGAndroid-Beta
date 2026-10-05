package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class um implements Utilities.Callback {
    public final int f31459a;
    public final xn f31460b;
    public final int f31461c;

    public um(xn xnVar, int i10, int i11) {
        this.f31459a = i11;
        this.f31460b = xnVar;
        this.f31461c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31459a) {
            case 0:
                this.f31460b.e0(this.f31461c, (qh.e) obj);
                return;
            default:
                xn xnVar = this.f31460b;
                xnVar.getClass();
                xnVar.e0(this.f31461c, new rh.e((String) obj));
                return;
        }
    }
}
