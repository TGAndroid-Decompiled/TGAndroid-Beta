package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n51 implements ey0 {
    public final t51 f26613a;

    public n51(t51 t51Var) {
        this.f26613a = t51Var;
    }

    @Override
    public final boolean b() {
        return this.f26613a.f28324b.a();
    }

    @Override
    public final boolean c() {
        return this.f26613a.f28324b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26613a.f28324b.f(document, obj, z11, i10);
    }
}
