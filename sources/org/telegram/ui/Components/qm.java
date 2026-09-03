package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qm implements Utilities.Callback {
    public final int f30467a;
    public final rn f30468b;
    public final int f30469c;

    public qm(rn rnVar, int i10, int i11) {
        this.f30467a = i11;
        this.f30468b = rnVar;
        this.f30469c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30467a) {
            case 0:
                this.f30468b.e0(this.f30469c, (eh.h) obj);
                return;
            default:
                rn rnVar = this.f30468b;
                rnVar.getClass();
                rnVar.e0(this.f30469c, new fh.e((String) obj));
                return;
        }
    }
}
