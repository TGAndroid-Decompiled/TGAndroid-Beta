package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h31 implements uv0 {
    public final n31 f34293a;

    public h31(n31 n31Var) {
        this.f34293a = n31Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, boolean z11, int i3, int i10) {
        this.f34293a.f36355b.f(document, obj, z11, i3);
    }

    @Override
    public final boolean b() {
        return this.f34293a.f36355b.a();
    }

    @Override
    public final boolean c() {
        return this.f34293a.f36355b.c();
    }
}
