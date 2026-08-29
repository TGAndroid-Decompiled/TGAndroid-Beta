package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m41 implements kx0 {
    public final s41 f30573a;

    public m41(s41 s41Var) {
        this.f30573a = s41Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f30573a.f32481b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f30573a.f32481b.a();
    }

    @Override
    public final boolean c() {
        return this.f30573a.f32481b.c();
    }
}
