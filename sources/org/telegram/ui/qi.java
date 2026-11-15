package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qi implements org.telegram.messenger.pr {
    public final int f50627a;
    public final boolean f50628b;
    public final Object f50629c;

    public qi(int i7, Object obj, boolean z10) {
        this.f50627a = i7;
        this.f50629c = obj;
        this.f50628b = z10;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.bc bcVar;
        switch (this.f50627a) {
            case 0:
                an anVar = ((si) this.f50629c).f51228b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
                    if (this.f50628b) {
                        bcVar = org.telegram.ui.Components.bc.H;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.J;
                    }
                    a02.m(bcVar, i7, 0, 0, anVar.Aa).j();
                    return;
                }
                return;
            default:
                ri riVar = (ri) this.f50629c;
                an anVar2 = riVar.f50958b.f51228b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = anVar2.f45173e;
                    TLRPC.User user = anVar2.f45187f;
                    boolean z10 = this.f50628b;
                    org.telegram.ui.Components.t4.r(anVar2, true, chat, user, false, false, false, z10, new w0(riVar, z10));
                    return;
                }
                anVar2.Ta(anVar2.f45358s4, true);
                return;
        }
    }
}
