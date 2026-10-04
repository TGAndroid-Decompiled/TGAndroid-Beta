package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.IntCallback {
    public final int f37706a;
    public final boolean f37707b;
    public final Object f37708c;

    public jj(int i10, Object obj, boolean z10) {
        this.f37706a = i10;
        this.f37708c = obj;
        this.f37707b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f37706a) {
            case 0:
                yn ynVar = ((lj) this.f37708c).f38278b;
                if (i10 > 0 && ynVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                    if (this.f37707b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, ynVar.f43299ca).j();
                    return;
                }
                return;
            default:
                kj kjVar = (kj) this.f37708c;
                yn ynVar2 = kjVar.f37993b.f38278b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = ynVar2.f43314e;
                    TLRPC.User user = ynVar2.f43326f;
                    boolean z10 = this.f37707b;
                    org.telegram.ui.Components.e5.s(ynVar2, true, chat, user, false, false, false, z10, new z0(kjVar, z10));
                    return;
                }
                ynVar2.pa(ynVar2.f43279b4, true);
                return;
        }
    }
}
