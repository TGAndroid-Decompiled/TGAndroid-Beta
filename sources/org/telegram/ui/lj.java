package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lj implements org.telegram.messenger.cs {
    public final int f39289a;
    public final boolean f39290b;
    public final Object f39291c;

    public lj(int i10, Object obj, boolean z10) {
        this.f39289a = i10;
        this.f39291c = obj;
        this.f39290b = z10;
    }

    @Override
    public final void a(int i10) {
        org.telegram.ui.Components.bc bcVar;
        switch (this.f39289a) {
            case 0:
                un unVar = ((nj) this.f39291c).f39917b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar);
                    if (this.f39290b) {
                        bcVar = org.telegram.ui.Components.bc.G;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.I;
                    }
                    a02.m(bcVar, i10, 0, 0, unVar.f42288xa).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f39291c;
                un unVar2 = mjVar.f39543b.f39917b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f42054f;
                    boolean z10 = this.f39290b;
                    org.telegram.ui.Components.s4.r(unVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    return;
                }
                unVar2.La(unVar2.f42205r4, true);
                return;
        }
    }
}
