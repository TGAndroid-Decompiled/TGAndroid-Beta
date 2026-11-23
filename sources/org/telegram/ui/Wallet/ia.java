package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;
public final class ia implements Runnable {
    public final int f44379a;
    public final na f44380b;

    public ia(na naVar, int i7) {
        this.f44379a = i7;
        this.f44380b = naVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44379a;
        na naVar = this.f44380b;
        switch (i7) {
            case 0:
                naVar.f44678e0 = null;
                return;
            default:
                lc.b0(naVar).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                return;
        }
    }
}
