package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class z41 implements vx0 {
    public final f51 f33722a;

    public z41(f51 f51Var) {
        this.f33722a = f51Var;
    }

    @Override
    public final boolean b() {
        return this.f33722a.f26758b.a();
    }

    @Override
    public final boolean c() {
        return this.f33722a.f26758b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.f33722a.f26758b.f(document, obj, z10, i10);
    }
}
