package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r31 implements yv0 {
    public final x31 f38836a;

    public r31(x31 x31Var) {
        this.f38836a = x31Var;
    }

    @Override
    public final boolean b() {
        return this.f38836a.f41545b.a();
    }

    @Override
    public final boolean c() {
        return this.f38836a.f41545b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f38836a.f41545b.f(document, obj, z11, i7);
    }
}
