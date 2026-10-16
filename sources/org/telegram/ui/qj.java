package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class qj implements MessagesStorage.IntCallback {
    public final int f39177a;
    public final boolean f39178b;
    public final Object f39179c;

    public qj(int i10, Object obj, boolean z10) {
        this.f39177a = i10;
        this.f39179c = obj;
        this.f39178b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.yc ycVar;
        switch (this.f39177a) {
            case 0:
                fo foVar = ((sj) this.f39179c).f39833b;
                if (i10 > 0 && foVar.getParentActivity() != null) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                    if (this.f39178b) {
                        ycVar = org.telegram.ui.Components.yc.G;
                    } else {
                        ycVar = org.telegram.ui.Components.yc.I;
                    }
                    a02.m(ycVar, i10, 0, 0, foVar.f35633ea).j();
                    return;
                }
                return;
            default:
                rj rjVar = (rj) this.f39179c;
                fo foVar2 = rjVar.f39531b.f39833b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = foVar2.e;
                    TLRPC.User user = foVar2.f35636f;
                    boolean z10 = this.f39178b;
                    org.telegram.ui.Components.g5.r(foVar2, true, chat, user, false, false, false, z10, new b1(rjVar, z10));
                    return;
                }
                foVar2.va(foVar2.f35616d4, true);
                return;
        }
    }
}
