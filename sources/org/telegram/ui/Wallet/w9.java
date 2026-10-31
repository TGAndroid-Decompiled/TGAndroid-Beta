package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
public final class w9 implements Runnable {
    public final int f35373a;
    public final ba f35374b;

    public w9(ba baVar, int i10) {
        this.f35373a = i10;
        this.f35374b = baVar;
    }

    @Override
    public final void run() {
        int i10 = this.f35373a;
        ba baVar = this.f35374b;
        switch (i10) {
            case 0:
                baVar.f34282d0 = null;
                return;
            default:
                cc.a0(baVar).N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                return;
        }
    }
}
