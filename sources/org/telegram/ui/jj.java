package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jj implements MessagesStorage.IntCallback {
    public final int f37712a;
    public final boolean f37713b;
    public final Object f37714c;

    public jj(int i10, Object obj, boolean z10) {
        this.f37712a = i10;
        this.f37714c = obj;
        this.f37713b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f37712a) {
            case 0:
                yn ynVar = ((lj) this.f37714c).f38284b;
                if (i10 > 0 && ynVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                    if (this.f37713b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, ynVar.f43307ca).j();
                    return;
                }
                return;
            default:
                kj kjVar = (kj) this.f37714c;
                yn ynVar2 = kjVar.f37999b.f38284b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = ynVar2.f43322e;
                    TLRPC.User user = ynVar2.f43334f;
                    boolean z10 = this.f37713b;
                    org.telegram.ui.Components.e5.s(ynVar2, true, chat, user, false, false, false, z10, new z0(kjVar, z10));
                    return;
                }
                ynVar2.pa(ynVar2.f43287b4, true);
                return;
        }
    }
}
