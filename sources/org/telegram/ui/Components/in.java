package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class in implements Utilities.Callback {
    public final int f27412a;
    public final lo f27413b;
    public final int f27414c;

    public in(lo loVar, int i10, int i11) {
        this.f27412a = i11;
        this.f27413b = loVar;
        this.f27414c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27412a) {
            case 0:
                this.f27413b.h0(this.f27414c, (qh.e) obj);
                return;
            default:
                lo loVar = this.f27413b;
                loVar.getClass();
                loVar.h0(this.f27414c, new rh.e((String) obj));
                return;
        }
    }
}
