package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class w51 implements my0 {
    public final c61 f32018a;

    public w51(c61 c61Var) {
        this.f32018a = c61Var;
    }

    @Override
    public final boolean b() {
        return this.f32018a.f25091b.a();
    }

    @Override
    public final boolean c() {
        return this.f32018a.f25091b.c();
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f32018a.f25091b.f(document, obj, z11, i10);
    }
}
