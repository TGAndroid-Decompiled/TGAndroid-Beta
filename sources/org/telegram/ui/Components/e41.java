package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class e41 implements hw0 {
    public final k41 f34679a;

    public e41(k41 k41Var) {
        this.f34679a = k41Var;
    }

    @Override
    public final boolean b() {
        return this.f34679a.f36766b.a();
    }

    @Override
    public final boolean c() {
        return this.f34679a.f36766b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f34679a.f36766b.f(document, obj, z11, i7);
    }
}
