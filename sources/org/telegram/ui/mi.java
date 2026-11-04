package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mi implements org.telegram.messenger.kr {
    public final int f47676a;
    public final boolean f47677b;
    public final Object f47678c;

    public mi(int i3, Object obj, boolean z10) {
        this.f47676a = i3;
        this.f47678c = obj;
        this.f47677b = z10;
    }

    @Override
    public final void a(int i3) {
        org.telegram.ui.Components.ec ecVar;
        switch (this.f47676a) {
            case 0:
                wm wmVar = ((oi) this.f47678c).f48298b;
                if (i3 > 0 && wmVar.getParentActivity() != null) {
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
                    if (this.f47677b) {
                        ecVar = org.telegram.ui.Components.ec.H;
                    } else {
                        ecVar = org.telegram.ui.Components.ec.J;
                    }
                    a02.m(ecVar, i3, 0, 0, wmVar.f51557ya).j();
                    return;
                }
                return;
            default:
                ni niVar = (ni) this.f47678c;
                wm wmVar2 = niVar.f48010b.f48298b;
                if (i3 >= 50) {
                    TLRPC.Chat chat = wmVar2.f51292e;
                    TLRPC.User user = wmVar2.f51306f;
                    boolean z10 = this.f47677b;
                    org.telegram.ui.Components.t4.r(wmVar2, true, chat, user, false, false, false, z10, new x0(niVar, z10));
                    return;
                }
                wmVar2.Qa(wmVar2.f51475s4, true);
                return;
        }
    }
}
