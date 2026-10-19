package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25283a;
    public final fo f25284b;
    public final int f25285c;

    public cn(fo foVar, int i10, int i11) {
        this.f25283a = i11;
        this.f25284b = foVar;
        this.f25285c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25283a) {
            case 0:
                this.f25284b.h0(this.f25285c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25284b;
                foVar.getClass();
                foVar.h0(this.f25285c, new sh.e((String) obj));
                return;
        }
    }
}
