package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h61 implements wy0 {
    public final n61 f26918a;

    public h61(n61 n61Var) {
        this.f26918a = n61Var;
    }

    @Override
    public final boolean b() {
        return this.f26918a.f28977b.a();
    }

    @Override
    public final boolean c() {
        return this.f26918a.f28977b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26918a.f28977b.f(document, obj, z11, i10);
    }
}
