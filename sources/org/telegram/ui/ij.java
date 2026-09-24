package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class ij implements MessagesStorage.IntCallback {
    public final int f34521a;
    public final boolean f34522b;
    public final Object f34523c;

    public ij(int i10, Object obj, boolean z10) {
        this.f34521a = i10;
        this.f34523c = obj;
        this.f34522b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f34521a) {
            case 0:
                wn wnVar = ((kj) this.f34523c).f35064b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(wnVar);
                    if (this.f34522b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, wnVar.f39454ea).j();
                    return;
                }
                return;
            default:
                jj jjVar = (jj) this.f34523c;
                wn wnVar2 = jjVar.f34802b.f35064b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f39456f;
                    boolean z10 = this.f34522b;
                    org.telegram.ui.Components.e5.s(wnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    return;
                }
                wnVar2.qa(wnVar2.f39436d4, true);
                return;
        }
    }
}
