package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f28560a;
    public final wn f28561b;
    public final int f28562c;

    public tm(wn wnVar, int i10, int i11) {
        this.f28560a = i11;
        this.f28561b = wnVar;
        this.f28562c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28560a) {
            case 0:
                this.f28561b.e0(this.f28562c, (qh.e) obj);
                return;
            default:
                wn wnVar = this.f28561b;
                wnVar.getClass();
                wnVar.e0(this.f28562c, new rh.e((String) obj));
                return;
        }
    }
}
