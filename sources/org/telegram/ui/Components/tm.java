package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f28590a;
    public final wn f28591b;
    public final int f28592c;

    public tm(wn wnVar, int i10, int i11) {
        this.f28590a = i11;
        this.f28591b = wnVar;
        this.f28592c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28590a) {
            case 0:
                this.f28591b.e0(this.f28592c, (qh.e) obj);
                return;
            default:
                wn wnVar = this.f28591b;
                wnVar.getClass();
                wnVar.e0(this.f28592c, new rh.e((String) obj));
                return;
        }
    }
}
