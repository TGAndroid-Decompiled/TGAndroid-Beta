package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o51 implements fy0 {
    public final u51 f26992a;

    public o51(u51 u51Var) {
        this.f26992a = u51Var;
    }

    @Override
    public final boolean b() {
        return this.f26992a.f28668b.a();
    }

    @Override
    public final boolean c() {
        return this.f26992a.f28668b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26992a.f28668b.f(document, obj, z11, i10);
    }
}
