package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f30076a;
    public final tn f30077b;
    public final int f30078c;

    public rm(tn tnVar, int i10, int i11) {
        this.f30076a = i11;
        this.f30077b = tnVar;
        this.f30078c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30076a) {
            case 0:
                this.f30077b.e0(this.f30078c, (rh.e) obj);
                return;
            default:
                tn tnVar = this.f30077b;
                tnVar.getClass();
                tnVar.e0(this.f30078c, new sh.e((String) obj));
                return;
        }
    }
}
