package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25226a;
    public final fo f25227b;
    public final int f25228c;

    public cn(fo foVar, int i10, int i11) {
        this.f25226a = i11;
        this.f25227b = foVar;
        this.f25228c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25226a) {
            case 0:
                this.f25227b.h0(this.f25228c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25227b;
                foVar.getClass();
                foVar.h0(this.f25228c, new sh.e((String) obj));
                return;
        }
    }
}
