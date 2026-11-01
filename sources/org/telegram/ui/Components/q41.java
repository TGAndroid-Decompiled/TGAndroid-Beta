package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class q41 implements ax0 {
    public final x41 f29631a;

    public q41(x41 x41Var) {
        this.f29631a = x41Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10, boolean z11, int i10, int i11) {
        this.f29631a.f32412b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f29631a.f32412b.a();
    }

    @Override
    public final boolean c() {
        return this.f29631a.f32412b.c();
    }
}
