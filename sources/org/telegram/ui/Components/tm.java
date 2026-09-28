package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f28591a;
    public final wn f28592b;
    public final int f28593c;

    public tm(wn wnVar, int i10, int i11) {
        this.f28591a = i11;
        this.f28592b = wnVar;
        this.f28593c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28591a) {
            case 0:
                this.f28592b.e0(this.f28593c, (qh.e) obj);
                return;
            default:
                wn wnVar = this.f28592b;
                wnVar.getClass();
                wnVar.e0(this.f28593c, new rh.e((String) obj));
                return;
        }
    }
}
