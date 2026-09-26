package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.IntCallback {
    public final int f34534a;
    public final boolean f34535b;
    public final Object f34536c;

    public ij(int i10, Object obj, boolean z10) {
        this.f34534a = i10;
        this.f34536c = obj;
        this.f34535b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f34534a) {
            case 0:
                wn wnVar = ((kj) this.f34536c).f35077b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar);
                    if (this.f34535b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, wnVar.f39469ea).j();
                    return;
                }
                return;
            default:
                jj jjVar = (jj) this.f34536c;
                wn wnVar2 = jjVar.f34816b.f35077b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f39471f;
                    boolean z10 = this.f34535b;
                    org.telegram.ui.Components.e5.s(wnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    return;
                }
                wnVar2.qa(wnVar2.f39451d4, true);
                return;
        }
    }
}
