package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class r31 implements yv0 {
    public final x31 f38834a;

    public r31(x31 x31Var) {
        this.f38834a = x31Var;
    }

    @Override
    public final boolean b() {
        return this.f38834a.f41548b.a();
    }

    @Override
    public final boolean c() {
        return this.f38834a.f41548b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f38834a.f41548b.f(document, obj, z11, i7);
    }
}
