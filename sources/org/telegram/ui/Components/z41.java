package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class z41 implements tx0 {
    public final f51 f30396a;

    public z41(f51 f51Var) {
        this.f30396a = f51Var;
    }

    @Override
    public final boolean b() {
        return this.f30396a.f23782b.a();
    }

    @Override
    public final boolean c() {
        return this.f30396a.f23782b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f30396a.f23782b.f(document, obj, z11, i10);
    }
}
