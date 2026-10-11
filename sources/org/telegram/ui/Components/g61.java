package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g61 implements vy0 {
    public final m61 f26672a;

    public g61(m61 m61Var) {
        this.f26672a = m61Var;
    }

    @Override
    public final boolean b() {
        return this.f26672a.f28757b.a();
    }

    @Override
    public final boolean c() {
        return this.f26672a.f28757b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26672a.f28757b.f(document, obj, z11, i10);
    }
}
