package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rm implements Utilities.Callback {
    public final int f30798a;
    public final sn f30799b;
    public final int f30800c;

    public rm(sn snVar, int i10, int i11) {
        this.f30798a = i11;
        this.f30799b = snVar;
        this.f30800c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30798a) {
            case 0:
                this.f30799b.e0(this.f30800c, (eh.h) obj);
                return;
            default:
                sn snVar = this.f30799b;
                snVar.getClass();
                snVar.e0(this.f30800c, new fh.e((String) obj));
                return;
        }
    }
}
