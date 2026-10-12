package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class qj implements MessagesStorage.IntCallback {
    public final int f39466a;
    public final boolean f39467b;
    public final Object f39468c;

    public qj(int i10, Object obj, boolean z10) {
        this.f39466a = i10;
        this.f39468c = obj;
        this.f39467b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.yc ycVar;
        switch (this.f39466a) {
            case 0:
                fo foVar = ((sj) this.f39468c).f40157b;
                if (i10 > 0 && foVar.getParentActivity() != null) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                    if (this.f39467b) {
                        ycVar = org.telegram.ui.Components.yc.G;
                    } else {
                        ycVar = org.telegram.ui.Components.yc.I;
                    }
                    a02.m(ycVar, i10, 0, 0, foVar.f35932ea).j();
                    return;
                }
                return;
            default:
                rj rjVar = (rj) this.f39468c;
                fo foVar2 = rjVar.f39813b.f40157b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = foVar2.e;
                    TLRPC.User user = foVar2.f35935f;
                    boolean z10 = this.f39467b;
                    org.telegram.ui.Components.g5.r(foVar2, true, chat, user, false, false, false, z10, new b1(rjVar, z10));
                    return;
                }
                foVar2.va(foVar2.f35915d4, true);
                return;
        }
    }
}
