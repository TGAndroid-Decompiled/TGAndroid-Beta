package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l31 implements vv0 {
    public final s31 f35525a;

    public l31(s31 s31Var) {
        this.f35525a = s31Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.f35525a.f37868b.f(document, obj, z10, i7);
    }

    @Override
    public final boolean b() {
        return this.f35525a.f37868b.a();
    }

    @Override
    public final boolean c() {
        return this.f35525a.f37868b.c();
    }
}
