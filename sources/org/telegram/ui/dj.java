package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class dj implements MessagesStorage.IntCallback {
    public final int f36635a;
    public final boolean f36636b;
    public final Object f36637c;

    public dj(int i10, Object obj, boolean z10) {
        this.f36635a = i10;
        this.f36637c = obj;
        this.f36636b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.uc ucVar;
        switch (this.f36635a) {
            case 0:
                sn snVar = ((fj) this.f36637c).f37347b;
                if (i10 > 0 && snVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(snVar);
                    if (this.f36636b) {
                        ucVar = org.telegram.ui.Components.uc.G;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.I;
                    }
                    a02.m(ucVar, i10, 0, 0, snVar.f41651qa).j();
                    return;
                }
                return;
            default:
                ej ejVar = (ej) this.f36637c;
                sn snVar2 = ejVar.f36920b.f37347b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = snVar2.e;
                    TLRPC.User user = snVar2.f41509f;
                    boolean z10 = this.f36636b;
                    org.telegram.ui.Components.d5.r(snVar2, true, chat, user, false, false, false, z10, new a1(ejVar, z10));
                    return;
                }
                snVar2.va(snVar2.f41635p4, true);
                return;
        }
    }
}
