package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m51 implements dy0 {
    public final s51 f26319a;

    public m51(s51 s51Var) {
        this.f26319a = s51Var;
    }

    @Override
    public final boolean b() {
        return this.f26319a.f28161b.a();
    }

    @Override
    public final boolean c() {
        return this.f26319a.f28161b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f26319a.f28161b.f(document, obj, z11, i10);
    }
}
