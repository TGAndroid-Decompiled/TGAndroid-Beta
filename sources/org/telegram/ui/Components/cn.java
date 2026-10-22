package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25225a;
    public final fo f25226b;
    public final int f25227c;

    public cn(fo foVar, int i10, int i11) {
        this.f25225a = i11;
        this.f25226b = foVar;
        this.f25227c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25225a) {
            case 0:
                this.f25226b.h0(this.f25227c, (rh.e) obj);
                return;
            default:
                fo foVar = this.f25226b;
                foVar.getClass();
                foVar.h0(this.f25227c, new sh.e((String) obj));
                return;
        }
    }
}
