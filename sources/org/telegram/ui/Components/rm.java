package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f30049a;
    public final tn f30050b;
    public final int f30051c;

    public rm(tn tnVar, int i10, int i11) {
        this.f30049a = i11;
        this.f30050b = tnVar;
        this.f30051c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30049a) {
            case 0:
                this.f30050b.e0(this.f30051c, (rh.e) obj);
                return;
            default:
                tn tnVar = this.f30050b;
                tnVar.getClass();
                tnVar.e0(this.f30051c, new sh.e((String) obj));
                return;
        }
    }
}
