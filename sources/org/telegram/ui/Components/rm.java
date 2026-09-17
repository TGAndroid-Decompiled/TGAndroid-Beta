package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f30077a;
    public final tn f30078b;
    public final int f30079c;

    public rm(tn tnVar, int i10, int i11) {
        this.f30077a = i11;
        this.f30078b = tnVar;
        this.f30079c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30077a) {
            case 0:
                this.f30078b.e0(this.f30079c, (rh.e) obj);
                return;
            default:
                tn tnVar = this.f30078b;
                tnVar.getClass();
                tnVar.e0(this.f30079c, new sh.e((String) obj));
                return;
        }
    }
}
