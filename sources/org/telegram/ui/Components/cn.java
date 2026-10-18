package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25314a;
    public final fo f25315b;
    public final int f25316c;

    public cn(fo foVar, int i10, int i11) {
        this.f25314a = i11;
        this.f25315b = foVar;
        this.f25316c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25314a) {
            case 0:
                this.f25315b.h0(this.f25316c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25315b;
                foVar.getClass();
                foVar.h0(this.f25316c, new sh.e((String) obj));
                return;
        }
    }
}
