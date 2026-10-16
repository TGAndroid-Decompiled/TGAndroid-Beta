package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fn implements Utilities.Callback {
    public final int f24780a;
    public final io f24781b;
    public final int f24782c;

    public fn(io ioVar, int i10, int i11) {
        this.f24780a = i11;
        this.f24781b = ioVar;
        this.f24782c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24780a) {
            case 0:
                this.f24781b.h0(this.f24782c, (rh.e) obj);
                return;
            default:
                io ioVar = this.f24781b;
                ioVar.getClass();
                ioVar.h0(this.f24782c, new sh.e((String) obj));
                return;
        }
    }
}
