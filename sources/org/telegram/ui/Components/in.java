package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class in implements Utilities.Callback {
    public final int f27469a;
    public final lo f27470b;
    public final int f27471c;

    public in(lo loVar, int i10, int i11) {
        this.f27469a = i11;
        this.f27470b = loVar;
        this.f27471c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27469a) {
            case 0:
                this.f27470b.h0(this.f27471c, (qh.e) obj);
                return;
            default:
                lo loVar = this.f27470b;
                loVar.getClass();
                loVar.h0(this.f27471c, new rh.e((String) obj));
                return;
        }
    }
}
