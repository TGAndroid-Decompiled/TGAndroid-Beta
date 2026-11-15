package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class th implements dj {
    public final ki f39699a;

    public th(ki kiVar) {
        this.f39699a = kiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.f39699a.f36424a2;
        if (anVar.u7()) {
            org.telegram.messenger.cz g10 = org.telegram.messenger.cz.g(user, anVar.f45258k6, anVar.E5, anVar.f45280m4, null, null, z10, i7, 0);
            g10.K = anVar.Y8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = anVar.j9();
            g10.T = anVar.f45421x5;
            anVar.getSendMessagesHelper().r0(g10);
            anVar.L6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.an) this.f39699a.f36424a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
