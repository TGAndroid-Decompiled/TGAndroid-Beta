package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class om implements Utilities.Callback {
    public final int f27590a;
    public final pn f27591b;
    public final int f27592c;

    public om(pn pnVar, int i10, int i11) {
        this.f27590a = i11;
        this.f27591b = pnVar;
        this.f27592c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27590a) {
            case 0:
                this.f27591b.e0(this.f27592c, (dh.h) obj);
                return;
            default:
                pn pnVar = this.f27591b;
                pnVar.getClass();
                pnVar.e0(this.f27592c, new eh.e((String) obj));
                return;
        }
    }
}
