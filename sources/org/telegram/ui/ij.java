package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.IntCallback {
    public final int f34629a;
    public final boolean f34630b;
    public final Object f34631c;

    public ij(int i10, Object obj, boolean z10) {
        this.f34629a = i10;
        this.f34631c = obj;
        this.f34630b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f34629a) {
            case 0:
                wn wnVar = ((kj) this.f34631c).f35167b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
                    if (this.f34630b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, wnVar.f39562ea).j();
                    return;
                }
                return;
            default:
                jj jjVar = (jj) this.f34631c;
                wn wnVar2 = jjVar.f34909b.f35167b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f39564f;
                    boolean z10 = this.f34630b;
                    org.telegram.ui.Components.e5.s(wnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    return;
                }
                wnVar2.qa(wnVar2.f39544d4, true);
                return;
        }
    }
}
