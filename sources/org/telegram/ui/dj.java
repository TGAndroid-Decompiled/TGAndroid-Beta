package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class dj implements MessagesStorage.IntCallback {
    public final int f36645a;
    public final boolean f36646b;
    public final Object f36647c;

    public dj(int i10, Object obj, boolean z10) {
        this.f36645a = i10;
        this.f36647c = obj;
        this.f36646b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f36645a) {
            case 0:
                sn snVar = ((fj) this.f36647c).f37343b;
                if (i10 > 0 && snVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
                    if (this.f36646b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, snVar.f41654qa).j();
                    return;
                }
                return;
            default:
                ej ejVar = (ej) this.f36647c;
                sn snVar2 = ejVar.f36980b.f37343b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = snVar2.e;
                    TLRPC.User user = snVar2.f41512f;
                    boolean z10 = this.f36646b;
                    org.telegram.ui.Components.f5.s(snVar2, true, chat, user, false, false, false, z10, new a1(ejVar, z10));
                    return;
                }
                snVar2.va(snVar2.f41638p4, true);
                return;
        }
    }
}
