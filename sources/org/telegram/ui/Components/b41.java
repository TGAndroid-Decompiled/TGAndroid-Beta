package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class b41 implements zw0 {
    public final h41 f27034a;

    public b41(h41 h41Var) {
        this.f27034a = h41Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i9, int i10) {
        this.f27034a.f28968b.f(document, obj, z11, i9);
    }

    @Override
    public final boolean b() {
        return this.f27034a.f28968b.a();
    }

    @Override
    public final boolean c() {
        return this.f27034a.f28968b.c();
    }
}
