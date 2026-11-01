package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
public final class w9 implements Runnable {
    public final int f35380a;
    public final ba f35381b;

    public w9(ba baVar, int i10) {
        this.f35380a = i10;
        this.f35381b = baVar;
    }

    @Override
    public final void run() {
        int i10 = this.f35380a;
        ba baVar = this.f35381b;
        switch (i10) {
            case 0:
                baVar.f34284d0 = null;
                return;
            default:
                cc.a0(baVar).N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                return;
        }
    }
}
