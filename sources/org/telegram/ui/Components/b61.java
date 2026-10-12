package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class b61 implements qy0 {
    public final h61 f23706a;

    public b61(h61 h61Var) {
        this.f23706a = h61Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f23706a.f25519b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f23706a.f25519b.a();
    }

    @Override
    public final boolean c() {
        return this.f23706a.f25519b.c();
    }
}
