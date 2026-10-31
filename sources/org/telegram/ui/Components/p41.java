package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p41 implements zw0 {
    public final w41 f29286a;

    public p41(w41 w41Var) {
        this.f29286a = w41Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10, boolean z11, int i10, int i11) {
        this.f29286a.f31996b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f29286a.f31996b.a();
    }

    @Override
    public final boolean c() {
        return this.f29286a.f31996b.c();
    }
}
