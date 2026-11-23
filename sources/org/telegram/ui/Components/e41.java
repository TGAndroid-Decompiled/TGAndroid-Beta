package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class e41 implements hw0 {
    public final k41 f34677a;

    public e41(k41 k41Var) {
        this.f34677a = k41Var;
    }

    @Override
    public final boolean b() {
        return this.f34677a.f36768b.a();
    }

    @Override
    public final boolean c() {
        return this.f34677a.f36768b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f34677a.f36768b.f(document, obj, z11, i7);
    }
}
