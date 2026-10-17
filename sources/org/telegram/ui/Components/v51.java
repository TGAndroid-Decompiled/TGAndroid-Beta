package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class v51 implements ly0 {
    public final b61 f31183a;

    public v51(b61 b61Var) {
        this.f31183a = b61Var;
    }

    @Override
    public final boolean b() {
        return this.f31183a.f24813b.a();
    }

    @Override
    public final boolean c() {
        return this.f31183a.f24813b.c();
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f31183a.f24813b.f(document, obj, z11, i10);
    }
}
