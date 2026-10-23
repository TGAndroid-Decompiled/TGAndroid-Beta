package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class c61 implements qy0 {
    public final i61 f25251a;

    public c61(i61 i61Var) {
        this.f25251a = i61Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f25251a.f27220b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f25251a.f27220b.a();
    }

    @Override
    public final boolean c() {
        return this.f25251a.f27220b.c();
    }
}
