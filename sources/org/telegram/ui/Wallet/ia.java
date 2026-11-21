package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;
public final class ia implements Runnable {
    public final int f44409a;
    public final na f44410b;

    public ia(na naVar, int i7) {
        this.f44409a = i7;
        this.f44410b = naVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44409a;
        na naVar = this.f44410b;
        switch (i7) {
            case 0:
                naVar.f44708e0 = null;
                return;
            default:
                lc.b0(naVar).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                return;
        }
    }
}
