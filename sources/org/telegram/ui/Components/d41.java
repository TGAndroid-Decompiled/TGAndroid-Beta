package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class d41 implements bx0 {

    public final j41 f27647a;

    public d41(j41 j41Var) {
        this.f27647a = j41Var;
    }

    @Override
    public final boolean b() {
        return this.f27647a.f29581b.a();
    }

    @Override
    public final boolean c() {
        return this.f27647a.f29581b.c();
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f27647a.f29581b.f(document, obj, z11, i10);
    }
}
