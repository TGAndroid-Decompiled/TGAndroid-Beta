package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k61 implements az0 {
    public final q61 f27770a;

    public k61(q61 q61Var) {
        this.f27770a = q61Var;
    }

    @Override
    public final boolean b() {
        return this.f27770a.f29716b.a();
    }

    @Override
    public final boolean c() {
        return this.f27770a.f29716b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f27770a.f29716b.f(document, obj, z11, i10);
    }
}
