package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hj implements MessagesStorage.IntCallback {
    public final int f39911a;
    public final boolean f39912b;
    public final Object f39913c;

    public hj(int i10, Object obj, boolean z10) {
        this.f39911a = i10;
        this.f39913c = obj;
        this.f39912b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.vc vcVar;
        switch (this.f39911a) {
            case 0:
                wn wnVar = ((jj) this.f39913c).f40550b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
                    if (this.f39912b) {
                        vcVar = org.telegram.ui.Components.vc.G;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.I;
                    }
                    b02.m(vcVar, i10, 0, 0, wnVar.f45309ua).j();
                    return;
                }
                return;
            default:
                ij ijVar = (ij) this.f39913c;
                wn wnVar2 = ijVar.f40199b.f40550b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f45113f;
                    boolean z10 = this.f39912b;
                    org.telegram.ui.Components.g5.r(wnVar2, true, chat, user, false, false, false, z10, new y0(ijVar, z10));
                    return;
                }
                wnVar2.Da(wnVar2.f45241p4, true);
                return;
        }
    }
}
