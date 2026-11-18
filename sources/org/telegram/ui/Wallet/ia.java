package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;
public final class ia implements Runnable {
    public final int f44369a;
    public final na f44370b;

    public ia(na naVar, int i7) {
        this.f44369a = i7;
        this.f44370b = naVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44369a;
        na naVar = this.f44370b;
        switch (i7) {
            case 0:
                naVar.f44668e0 = null;
                return;
            default:
                lc.b0(naVar).N(gd.M0(2131745666, null), gd.M0(2131751094, null)).j();
                return;
        }
    }
}
