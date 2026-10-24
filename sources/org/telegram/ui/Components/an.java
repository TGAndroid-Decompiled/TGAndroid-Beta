package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class an implements Utilities.Callback {
    public final int f24752a;
    public final co f24753b;
    public final int f24754c;

    public an(co coVar, int i10, int i11) {
        this.f24752a = i11;
        this.f24753b = coVar;
        this.f24754c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24752a) {
            case 0:
                this.f24753b.h0(this.f24754c, (rh.e) obj);
                return;
            default:
                co coVar = this.f24753b;
                coVar.getClass();
                coVar.h0(this.f24754c, new sh.e((String) obj));
                return;
        }
    }
}
