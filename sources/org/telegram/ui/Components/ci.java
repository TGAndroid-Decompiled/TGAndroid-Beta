package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ci implements lj {
    public final ti f34066a;

    public ci(ti tiVar) {
        this.f34066a = tiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f34066a.f39956a2;
        if (bnVar.u7()) {
            org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(user, bnVar.f46271l6, bnVar.F5, bnVar.f46282m4, null, null, z10, i7, 0);
            g10.K = bnVar.Y8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = bnVar.j9();
            g10.T = bnVar.f46436y5;
            bnVar.getSendMessagesHelper().r0(g10);
            bnVar.L6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.bn) this.f34066a.f39956a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
