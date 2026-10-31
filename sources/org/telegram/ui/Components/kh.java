package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kh implements vi {
    public final bi f27760a;

    public kh(bi biVar) {
        this.f27760a = biVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.un unVar = (org.telegram.ui.un) this.f27760a.W1;
        if (unVar.n7()) {
            org.telegram.messenger.oz g10 = org.telegram.messenger.oz.g(user, unVar.f42297j6, unVar.D5, unVar.l4, null, null, z10, i10, 0);
            g10.K = unVar.P8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j10;
            g10.R = unVar.a9();
            g10.T = unVar.f42459w5;
            unVar.getSendMessagesHelper().r0(g10);
            unVar.F6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.un) this.f27760a.W1).vb(arrayList, str, z10, i10, j10, z11);
    }
}
