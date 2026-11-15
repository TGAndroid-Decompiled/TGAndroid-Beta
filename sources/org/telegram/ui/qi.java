package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qi implements org.telegram.messenger.pr {
    public final int f50618a;
    public final boolean f50619b;
    public final Object f50620c;

    public qi(int i7, Object obj, boolean z10) {
        this.f50618a = i7;
        this.f50620c = obj;
        this.f50619b = z10;
    }

    @Override
    public final void a(int i7) {
        org.telegram.ui.Components.bc bcVar;
        switch (this.f50618a) {
            case 0:
                an anVar = ((si) this.f50620c).f51224b;
                if (i7 > 0 && anVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
                    if (this.f50619b) {
                        bcVar = org.telegram.ui.Components.bc.H;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.J;
                    }
                    a02.m(bcVar, i7, 0, 0, anVar.Aa).j();
                    return;
                }
                return;
            default:
                ri riVar = (ri) this.f50620c;
                an anVar2 = riVar.f50957b.f51224b;
                if (i7 >= 50) {
                    TLRPC.Chat chat = anVar2.f45172e;
                    TLRPC.User user = anVar2.f45186f;
                    boolean z10 = this.f50619b;
                    org.telegram.ui.Components.t4.r(anVar2, true, chat, user, false, false, false, z10, new w0(riVar, z10));
                    return;
                }
                anVar2.Ta(anVar2.f45357s4, true);
                return;
        }
    }
}
