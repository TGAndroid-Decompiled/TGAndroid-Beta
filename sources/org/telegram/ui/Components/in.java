package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class in implements Utilities.Callback {
    public final int f27438a;
    public final lo f27439b;
    public final int f27440c;

    public in(lo loVar, int i10, int i11) {
        this.f27438a = i11;
        this.f27439b = loVar;
        this.f27440c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27438a) {
            case 0:
                this.f27439b.h0(this.f27440c, (qh.e) obj);
                return;
            default:
                lo loVar = this.f27439b;
                loVar.getClass();
                loVar.h0(this.f27440c, new rh.e((String) obj));
                return;
        }
    }
}
