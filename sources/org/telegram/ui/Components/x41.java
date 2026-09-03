package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class x41 implements ux0 {
    public final d51 f32949a;

    public x41(d51 d51Var) {
        this.f32949a = d51Var;
    }

    @Override
    public final boolean b() {
        return this.f32949a.f26187b.a();
    }

    @Override
    public final boolean c() {
        return this.f32949a.f26187b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.f32949a.f26187b.f(document, obj, z10, i10);
    }
}
