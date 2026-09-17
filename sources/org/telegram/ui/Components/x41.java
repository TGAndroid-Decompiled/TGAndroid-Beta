package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class x41 implements rx0 {
    public final d51 f32455a;

    public x41(d51 d51Var) {
        this.f32455a = d51Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f32455a.f25258b.f(document, obj, z11, i10);
    }

    @Override
    public final boolean b() {
        return this.f32455a.f25258b.a();
    }

    @Override
    public final boolean c() {
        return this.f32455a.f25258b.c();
    }
}
