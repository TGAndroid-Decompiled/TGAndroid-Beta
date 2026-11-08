package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh implements wi {
    public final di f35984a;

    public mh(di diVar) {
        this.f35984a = diVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.f35984a.W1;
        if (anVar.t7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, anVar.f43848j6, anVar.D5, anVar.f43870l4, null, null, z9, i7, 0);
            g10.K = anVar.W8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = anVar.h9();
            g10.T = anVar.f44010w5;
            anVar.getSendMessagesHelper().r0(g10);
            anVar.K6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.an) this.f35984a.W1).Fb(arrayList, str, z9, i7, j3, z10);
    }
}
