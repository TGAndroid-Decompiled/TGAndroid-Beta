package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d41 implements gw0 {
    public final j41 f34209a;

    public d41(j41 j41Var) {
        this.f34209a = j41Var;
    }

    @Override
    public final boolean b() {
        return this.f34209a.f36261b.a();
    }

    @Override
    public final boolean c() {
        return this.f34209a.f36261b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f34209a.f36261b.f(document, obj, z11, i7);
    }
}
