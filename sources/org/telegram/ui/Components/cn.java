package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25307a;
    public final fo f25308b;
    public final int f25309c;

    public cn(fo foVar, int i10, int i11) {
        this.f25307a = i11;
        this.f25308b = foVar;
        this.f25309c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25307a) {
            case 0:
                this.f25308b.h0(this.f25309c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25308b;
                foVar.getClass();
                foVar.h0(this.f25309c, new sh.e((String) obj));
                return;
        }
    }
}
