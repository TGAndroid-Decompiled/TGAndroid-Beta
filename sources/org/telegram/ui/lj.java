package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lj implements org.telegram.messenger.bs {
    public final int f39249a;
    public final boolean f39250b;
    public final Object f39251c;

    public lj(int i10, Object obj, boolean z10) {
        this.f39249a = i10;
        this.f39251c = obj;
        this.f39250b = z10;
    }

    @Override
    public final void a(int i10) {
        org.telegram.ui.Components.bc bcVar;
        switch (this.f39249a) {
            case 0:
                un unVar = ((nj) this.f39251c).f39956b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
                    if (this.f39250b) {
                        bcVar = org.telegram.ui.Components.bc.G;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.I;
                    }
                    a02.m(bcVar, i10, 0, 0, unVar.f42477xa).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f39251c;
                un unVar2 = mjVar.f39712b.f39956b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f42243f;
                    boolean z10 = this.f39250b;
                    org.telegram.ui.Components.s4.r(unVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    return;
                }
                unVar2.Ga(unVar2.f42394r4, true);
                return;
        }
    }
}
