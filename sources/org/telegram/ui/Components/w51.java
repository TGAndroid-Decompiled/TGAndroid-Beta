package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class w51 implements ny0 {
    public final c61 f32467a;

    public w51(c61 c61Var) {
        this.f32467a = c61Var;
    }

    @Override
    public final boolean b() {
        return this.f32467a.f25227b.a();
    }

    @Override
    public final boolean c() {
        return this.f32467a.f25227b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f32467a.f25227b.f(document, obj, z11, i10);
    }
}
