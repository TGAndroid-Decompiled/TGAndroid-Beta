package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y41 implements ux0 {
    public final e51 f30848a;

    public y41(e51 e51Var) {
        this.f30848a = e51Var;
    }

    @Override
    public final boolean b() {
        return this.f30848a.f24467b.a();
    }

    @Override
    public final boolean c() {
        return this.f30848a.f24467b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.f30848a.f24467b.f(document, obj, z10, i10);
    }
}
