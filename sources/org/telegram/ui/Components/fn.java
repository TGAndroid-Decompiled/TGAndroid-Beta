package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fn implements Utilities.Callback {
    public final int f25084a;
    public final io f25085b;
    public final int f25086c;

    public fn(io ioVar, int i10, int i11) {
        this.f25084a = i11;
        this.f25085b = ioVar;
        this.f25086c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25084a) {
            case 0:
                this.f25085b.h0(this.f25086c, (rh.e) obj);
                return;
            default:
                io ioVar = this.f25085b;
                ioVar.getClass();
                ioVar.h0(this.f25086c, new sh.e((String) obj));
                return;
        }
    }
}
