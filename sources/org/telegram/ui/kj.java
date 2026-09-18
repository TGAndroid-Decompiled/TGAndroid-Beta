package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kj implements MessagesStorage.IntCallback {
    public final int f35116a;
    public final boolean f35117b;
    public final Object f35118c;

    public kj(int i10, Object obj, boolean z10) {
        this.f35116a = i10;
        this.f35118c = obj;
        this.f35117b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f35116a) {
            case 0:
                zn znVar = ((mj) this.f35118c).f35681b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                    if (this.f35117b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, znVar.f40261ea).j();
                    return;
                }
                return;
            default:
                lj ljVar = (lj) this.f35118c;
                zn znVar2 = ljVar.f35389b.f35681b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f40263f;
                    boolean z10 = this.f35117b;
                    org.telegram.ui.Components.e5.s(znVar2, true, chat, user, false, false, false, z10, new y0(ljVar, z10));
                    return;
                }
                znVar2.qa(znVar2.f40243d4, true);
                return;
        }
    }
}
