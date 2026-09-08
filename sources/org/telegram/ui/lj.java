package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.IntCallback {
    public final int f38403a;
    public final boolean f38404b;
    public final Object f38405c;

    public lj(int i10, Object obj, boolean z10) {
        this.f38403a = i10;
        this.f38405c = obj;
        this.f38404b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.xc xcVar;
        switch (this.f38403a) {
            case 0:
                co coVar = ((nj) this.f38405c).f38994b;
                if (i10 > 0 && coVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                    if (this.f38404b) {
                        xcVar = org.telegram.ui.Components.xc.G;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.I;
                    }
                    a02.m(xcVar, i10, 0, 0, coVar.f35274ea).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f38405c;
                co coVar2 = mjVar.f38748b.f38994b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = coVar2.f35264e;
                    TLRPC.User user = coVar2.f35276f;
                    boolean z10 = this.f38404b;
                    org.telegram.ui.Components.e5.s(coVar2, true, chat, user, false, false, false, z10, new z0(mjVar, z10));
                    return;
                }
                coVar2.qa(coVar2.f35255d4, true);
                return;
        }
    }
}
