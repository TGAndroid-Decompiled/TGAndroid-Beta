package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sm implements Utilities.Callback {
    public final int f27954a;
    public final vn f27955b;
    public final int f27956c;

    public sm(vn vnVar, int i10, int i11) {
        this.f27954a = i11;
        this.f27955b = vnVar;
        this.f27956c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27954a) {
            case 0:
                this.f27955b.e0(this.f27956c, (qh.e) obj);
                return;
            default:
                vn vnVar = this.f27955b;
                vnVar.getClass();
                vnVar.e0(this.f27956c, new rh.e((String) obj));
                return;
        }
    }
}
