package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh implements wi {
    public final di f35940a;

    public mh(di diVar) {
        this.f35940a = diVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.f35940a.W1;
        if (anVar.t7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, anVar.f43843j6, anVar.D5, anVar.f43865l4, null, null, z9, i7, 0);
            g10.K = anVar.W8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = anVar.h9();
            g10.T = anVar.f44005w5;
            anVar.getSendMessagesHelper().r0(g10);
            anVar.K6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.an) this.f35940a.W1).Fb(arrayList, str, z9, i7, j3, z10);
    }
}
