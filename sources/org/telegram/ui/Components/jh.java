package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh implements vi {
    public final bi f35071a;

    public jh(bi biVar) {
        this.f35071a = biVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i3, long j10) {
        org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.f35071a.X1;
        if (wmVar.t7()) {
            org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g(user, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, null, null, z10, i3, 0);
            g7.K = wmVar.W8();
            g7.O = 0L;
            g7.L = false;
            g7.Q = j10;
            g7.R = wmVar.h9();
            g7.T = wmVar.f51540x5;
            wmVar.getSendMessagesHelper().r0(g7);
            wmVar.K6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i3, long j10, boolean z11) {
        ((org.telegram.ui.wm) this.f35071a.X1).Fb(arrayList, str, z10, i3, j10, z11);
    }
}
