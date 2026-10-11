package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class in implements Utilities.Callback {
    public final int f27395a;
    public final lo f27396b;
    public final int f27397c;

    public in(lo loVar, int i10, int i11) {
        this.f27395a = i11;
        this.f27396b = loVar;
        this.f27397c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27395a) {
            case 0:
                this.f27396b.h0(this.f27397c, (qh.e) obj);
                return;
            default:
                lo loVar = this.f27396b;
                loVar.getClass();
                loVar.h0(this.f27397c, new rh.e((String) obj));
                return;
        }
    }
}
