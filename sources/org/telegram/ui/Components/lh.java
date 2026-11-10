package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lh implements vi {
    public final ci f35675a;

    public lh(ci ciVar) {
        this.f35675a = ciVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f35675a.Z1;
        if (cnVar.u7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, cnVar.f44545j6, cnVar.D5, cnVar.f44568l4, null, null, z9, i7, 0);
            g10.K = cnVar.X8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = cnVar.i9();
            g10.T = cnVar.f44708w5;
            cnVar.getSendMessagesHelper().r0(g10);
            cnVar.L6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.cn) this.f35675a.Z1).Ib(arrayList, str, z9, i7, j3, z10);
    }
}
