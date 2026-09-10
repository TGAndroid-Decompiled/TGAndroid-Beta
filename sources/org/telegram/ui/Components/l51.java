package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l51 implements ey0 {
    public final r51 f24887a;

    public l51(r51 r51Var) {
        this.f24887a = r51Var;
    }

    @Override
    public final boolean b() {
        return this.f24887a.f26590b.a();
    }

    @Override
    public final boolean c() {
        return this.f24887a.f26590b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f24887a.f26590b.f(document, obj, z11, i10);
    }
}
