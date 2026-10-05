package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class x51 implements oy0 {
    public final d61 f32819a;

    public x51(d61 d61Var) {
        this.f32819a = d61Var;
    }

    @Override
    public final boolean b() {
        return this.f32819a.f25684b.a();
    }

    @Override
    public final boolean c() {
        return this.f32819a.f25684b.c();
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.f32819a.f25684b.f(document, obj, z11, i10);
    }
}
