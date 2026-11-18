package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b41 implements fw0 {
    public final h41 f33528a;

    public b41(h41 h41Var) {
        this.f33528a = h41Var;
    }

    @Override
    public final boolean b() {
        return this.f33528a.f35715b.a();
    }

    @Override
    public final boolean c() {
        return this.f33528a.f35715b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.f33528a.f35715b.f(document, obj, z11, i7);
    }
}
