package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f28633a;
    public final wn f28634b;
    public final int f28635c;

    public tm(wn wnVar, int i10, int i11) {
        this.f28633a = i11;
        this.f28634b = wnVar;
        this.f28635c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28633a) {
            case 0:
                this.f28634b.e0(this.f28635c, (qh.e) obj);
                return;
            default:
                wn wnVar = this.f28634b;
                wnVar.getClass();
                wnVar.e0(this.f28635c, new rh.e((String) obj));
                return;
        }
    }
}
