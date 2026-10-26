package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j61 implements zy0 {
    public final p61 f29500a;

    public j61(p61 p61Var) {
        this.f29500a = p61Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f29500a.f31452b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f29500a.f31452b.a();
    }

    @Override
    public final boolean c() {
        return this.f29500a.f31452b.c();
    }
}
