package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25285a;
    public final fo f25286b;
    public final int f25287c;

    public cn(fo foVar, int i10, int i11) {
        this.f25285a = i11;
        this.f25286b = foVar;
        this.f25287c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25285a) {
            case 0:
                this.f25286b.h0(this.f25287c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25286b;
                foVar.getClass();
                foVar.h0(this.f25287c, new sh.e((String) obj));
                return;
        }
    }
}
