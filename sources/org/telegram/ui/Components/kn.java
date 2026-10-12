package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class kn implements Utilities.Callback {
    public final int f27883a;
    public final no f27884b;
    public final int f27885c;

    public kn(no noVar, int i10, int i11) {
        this.f27883a = i11;
        this.f27884b = noVar;
        this.f27885c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27883a) {
            case 0:
                this.f27884b.h0(this.f27885c, (qh.e) obj);
                return;
            default:
                no noVar = this.f27884b;
                noVar.getClass();
                noVar.h0(this.f27885c, new rh.e((String) obj));
                return;
        }
    }
}
