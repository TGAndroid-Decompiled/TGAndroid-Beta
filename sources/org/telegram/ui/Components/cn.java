package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25222a;
    public final fo f25223b;
    public final int f25224c;

    public cn(fo foVar, int i10, int i11) {
        this.f25222a = i11;
        this.f25223b = foVar;
        this.f25224c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25222a) {
            case 0:
                this.f25223b.h0(this.f25224c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25223b;
                foVar.getClass();
                foVar.h0(this.f25224c, new sh.e((String) obj));
                return;
        }
    }
}
