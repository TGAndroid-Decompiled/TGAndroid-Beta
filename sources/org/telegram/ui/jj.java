package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.IntCallback {
    public final int f37707a;
    public final boolean f37708b;
    public final Object f37709c;

    public jj(int i10, Object obj, boolean z10) {
        this.f37707a = i10;
        this.f37709c = obj;
        this.f37708b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f37707a) {
            case 0:
                yn ynVar = ((lj) this.f37709c).f38279b;
                if (i10 > 0 && ynVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                    if (this.f37708b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, ynVar.f43300ca).j();
                    return;
                }
                return;
            default:
                kj kjVar = (kj) this.f37709c;
                yn ynVar2 = kjVar.f37994b.f38279b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = ynVar2.f43315e;
                    TLRPC.User user = ynVar2.f43327f;
                    boolean z10 = this.f37708b;
                    org.telegram.ui.Components.e5.s(ynVar2, true, chat, user, false, false, false, z10, new z0(kjVar, z10));
                    return;
                }
                ynVar2.pa(ynVar2.f43280b4, true);
                return;
        }
    }
}
