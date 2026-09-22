package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y41 implements sx0 {
    public final e51 f30153a;

    public y41(e51 e51Var) {
        this.f30153a = e51Var;
    }

    @Override
    public final boolean b() {
        return this.f30153a.f23540b.a();
    }

    @Override
    public final boolean c() {
        return this.f30153a.f23540b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f30153a.f23540b.f(document, obj, z11, i10);
    }
}
