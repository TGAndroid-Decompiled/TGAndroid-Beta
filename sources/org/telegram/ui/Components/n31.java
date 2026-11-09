package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class n31 implements wv0 {
    public final u31 f36244a;

    public n31(u31 u31Var) {
        this.f36244a = u31Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.f36244a.f38579b.f(document, obj, z10, i7);
    }

    @Override
    public final boolean b() {
        return this.f36244a.f38579b.a();
    }

    @Override
    public final boolean c() {
        return this.f36244a.f38579b.c();
    }
}
