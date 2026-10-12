package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k61 implements az0 {
    public final q61 f27767a;

    public k61(q61 q61Var) {
        this.f27767a = q61Var;
    }

    @Override
    public final boolean b() {
        return this.f27767a.f29738b.a();
    }

    @Override
    public final boolean c() {
        return this.f27767a.f29738b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f27767a.f29738b.f(document, obj, z11, i10);
    }
}
