package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;
public final class ja implements Runnable {
    public final int f44541a;
    public final oa f44542b;

    public ja(oa oaVar, int i7) {
        this.f44541a = i7;
        this.f44542b = oaVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44541a;
        oa oaVar = this.f44542b;
        switch (i7) {
            case 0:
                oaVar.f44840e0 = null;
                return;
            default:
                kc.b0(oaVar).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                return;
        }
    }
}
