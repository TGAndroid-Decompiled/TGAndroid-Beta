package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sm implements Utilities.Callback {
    public final int f28267a;
    public final vn f28268b;
    public final int f28269c;

    public sm(vn vnVar, int i10, int i11) {
        this.f28267a = i11;
        this.f28268b = vnVar;
        this.f28269c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28267a) {
            case 0:
                this.f28268b.e0(this.f28269c, (qh.e) obj);
                return;
            default:
                vn vnVar = this.f28268b;
                vnVar.getClass();
                vnVar.e0(this.f28269c, new rh.e((String) obj));
                return;
        }
    }
}
