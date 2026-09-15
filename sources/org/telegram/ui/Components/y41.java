package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y41 implements sx0 {
    public final e51 f30156a;

    public y41(e51 e51Var) {
        this.f30156a = e51Var;
    }

    @Override
    public final boolean b() {
        return this.f30156a.f23543b.a();
    }

    @Override
    public final boolean c() {
        return this.f30156a.f23543b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f30156a.f23543b.f(document, obj, z11, i10);
    }
}
