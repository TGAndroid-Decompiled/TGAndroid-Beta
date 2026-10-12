package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class kn implements Utilities.Callback {
    public final int f27897a;
    public final no f27898b;
    public final int f27899c;

    public kn(no noVar, int i10, int i11) {
        this.f27897a = i11;
        this.f27898b = noVar;
        this.f27899c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27897a) {
            case 0:
                this.f27898b.h0(this.f27899c, (qh.e) obj);
                return;
            default:
                no noVar = this.f27898b;
                noVar.getClass();
                noVar.h0(this.f27899c, new rh.e((String) obj));
                return;
        }
    }
}
