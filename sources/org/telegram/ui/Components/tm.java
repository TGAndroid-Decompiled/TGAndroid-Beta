package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f28592a;
    public final wn f28593b;
    public final int f28594c;

    public tm(wn wnVar, int i10, int i11) {
        this.f28592a = i11;
        this.f28593b = wnVar;
        this.f28594c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28592a) {
            case 0:
                this.f28593b.e0(this.f28594c, (qh.e) obj);
                return;
            default:
                wn wnVar = this.f28593b;
                wnVar.getClass();
                wnVar.e0(this.f28594c, new rh.e((String) obj));
                return;
        }
    }
}
