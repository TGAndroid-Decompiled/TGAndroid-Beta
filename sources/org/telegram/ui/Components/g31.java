package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g31 implements vv0 {
    public final n31 f33816a;

    public g31(n31 n31Var) {
        this.f33816a = n31Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.f33816a.f36232b.f(document, obj, z10, i7);
    }

    @Override
    public final boolean b() {
        return this.f33816a.f36232b.a();
    }

    @Override
    public final boolean c() {
        return this.f33816a.f36232b.c();
    }
}
