package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class qj implements MessagesStorage.IntCallback {
    public final int f41340a;
    public final boolean f41341b;
    public final Object f41342c;

    public qj(int i10, Object obj, boolean z10) {
        this.f41340a = i10;
        this.f41342c = obj;
        this.f41341b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.yc ycVar;
        switch (this.f41340a) {
            case 0:
                eo eoVar = ((sj) this.f41342c).f41937b;
                if (i10 > 0 && eoVar.getParentActivity() != null) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar);
                    if (this.f41341b) {
                        ycVar = org.telegram.ui.Components.yc.G;
                    } else {
                        ycVar = org.telegram.ui.Components.yc.I;
                    }
                    a02.m(ycVar, i10, 0, 0, eoVar.f37251ea).j();
                    return;
                }
                return;
            default:
                rj rjVar = (rj) this.f41342c;
                eo eoVar2 = rjVar.f41667b.f41937b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = eoVar2.f37241e;
                    TLRPC.User user = eoVar2.f37253f;
                    boolean z10 = this.f41341b;
                    org.telegram.ui.Components.g5.r(eoVar2, true, chat, user, false, false, false, z10, new z0(rjVar, z10));
                    return;
                }
                eoVar2.va(eoVar2.f37232d4, true);
                return;
        }
    }
}
