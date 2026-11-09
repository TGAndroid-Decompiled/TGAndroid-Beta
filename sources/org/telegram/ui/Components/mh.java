package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh implements wi {
    public final di f36091a;

    public mh(di diVar) {
        this.f36091a = diVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f36091a.W1;
        if (cnVar.u7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, cnVar.f44504j6, cnVar.D5, cnVar.f44527l4, null, null, z9, i7, 0);
            g10.K = cnVar.X8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = cnVar.i9();
            g10.T = cnVar.f44667w5;
            cnVar.getSendMessagesHelper().r0(g10);
            cnVar.L6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.cn) this.f36091a.W1).Ib(arrayList, str, z9, i7, j3, z10);
    }
}
