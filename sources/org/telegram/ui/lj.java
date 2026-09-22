package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.IntCallback {
    public final int f35479a;
    public final boolean f35480b;
    public final Object f35481c;

    public lj(int i10, Object obj, boolean z10) {
        this.f35479a = i10;
        this.f35481c = obj;
        this.f35480b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.wc wcVar;
        switch (this.f35479a) {
            case 0:
                zn znVar = ((nj) this.f35481c).f36059b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar);
                    if (this.f35480b) {
                        wcVar = org.telegram.ui.Components.wc.G;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.I;
                    }
                    a02.m(wcVar, i10, 0, 0, znVar.f40324ea).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f35481c;
                zn znVar2 = mjVar.f35766b.f36059b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f40326f;
                    boolean z10 = this.f35480b;
                    org.telegram.ui.Components.d5.s(znVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    return;
                }
                znVar2.qa(znVar2.f40306d4, true);
                return;
        }
    }
}
