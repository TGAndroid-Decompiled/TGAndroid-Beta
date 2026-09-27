package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.IntCallback {
    public final int f35091a;
    public final boolean f35092b;
    public final Object f35093c;

    public kj(int i10, Object obj, boolean z10) {
        this.f35091a = i10;
        this.f35093c = obj;
        this.f35092b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f35091a) {
            case 0:
                xn xnVar = ((mj) this.f35093c).f35714b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xnVar);
                    if (this.f35092b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, xnVar.f39750ea).j();
                    return;
                }
                return;
            default:
                lj ljVar = (lj) this.f35093c;
                xn xnVar2 = ljVar.f35363b.f35714b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = xnVar2.e;
                    TLRPC.User user = xnVar2.f39752f;
                    boolean z10 = this.f35092b;
                    org.telegram.ui.Components.e5.s(xnVar2, true, chat, user, false, false, false, z10, new a1(ljVar, z10));
                    return;
                }
                xnVar2.qa(xnVar2.f39732d4, true);
                return;
        }
    }
}
