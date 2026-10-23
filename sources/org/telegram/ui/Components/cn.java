package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25380a;
    public final fo f25381b;
    public final int f25382c;

    public cn(fo foVar, int i10, int i11) {
        this.f25380a = i11;
        this.f25381b = foVar;
        this.f25382c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25380a) {
            case 0:
                this.f25381b.h0(this.f25382c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25381b;
                foVar.getClass();
                foVar.h0(this.f25382c, new sh.e((String) obj));
                return;
        }
    }
}
