package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f30050a;
    public final tn f30051b;
    public final int f30052c;

    public rm(tn tnVar, int i10, int i11) {
        this.f30050a = i11;
        this.f30051b = tnVar;
        this.f30052c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30050a) {
            case 0:
                this.f30051b.e0(this.f30052c, (rh.e) obj);
                return;
            default:
                tn tnVar = this.f30051b;
                tnVar.getClass();
                tnVar.e0(this.f30052c, new sh.e((String) obj));
                return;
        }
    }
}
