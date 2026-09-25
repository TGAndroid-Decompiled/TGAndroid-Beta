package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.IntCallback {
    public final int f34535a;
    public final boolean f34536b;
    public final Object f34537c;

    public ij(int i10, Object obj, boolean z10) {
        this.f34535a = i10;
        this.f34537c = obj;
        this.f34536b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f34535a) {
            case 0:
                wn wnVar = ((kj) this.f34537c).f35078b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar);
                    if (this.f34536b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, wnVar.f39470ea).j();
                    return;
                }
                return;
            default:
                jj jjVar = (jj) this.f34537c;
                wn wnVar2 = jjVar.f34817b.f35078b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f39472f;
                    boolean z10 = this.f34536b;
                    org.telegram.ui.Components.e5.s(wnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    return;
                }
                wnVar2.qa(wnVar2.f39452d4, true);
                return;
        }
    }
}
