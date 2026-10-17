package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class fj implements MessagesStorage.IntCallback {
    public final int f36943a;
    public final boolean f36944b;
    public final Object f36945c;

    public fj(int i10, Object obj, boolean z10) {
        this.f36943a = i10;
        this.f36945c = obj;
        this.f36944b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f36943a) {
            case 0:
                sn snVar = ((hj) this.f36945c).f37566b;
                if (i10 > 0 && snVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
                    if (this.f36944b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, snVar.f41205ea).j();
                    return;
                }
                return;
            default:
                gj gjVar = (gj) this.f36945c;
                sn snVar2 = gjVar.f37253b.f37566b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = snVar2.e;
                    TLRPC.User user = snVar2.f41208f;
                    boolean z10 = this.f36944b;
                    org.telegram.ui.Components.f5.r(snVar2, true, chat, user, false, false, false, z10, new b1(gjVar, z10));
                    return;
                }
                snVar2.va(snVar2.f41188d4, true);
                return;
        }
    }
}
