package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l51 implements cy0 {
    public final r51 f26024a;

    public l51(r51 r51Var) {
        this.f26024a = r51Var;
    }

    @Override
    public final boolean b() {
        return this.f26024a.f27872b.a();
    }

    @Override
    public final boolean c() {
        return this.f26024a.f27872b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26024a.f27872b.f(document, obj, z11, i10);
    }
}
