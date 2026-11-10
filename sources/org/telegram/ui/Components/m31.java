package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class m31 implements vv0 {
    public final t31 f35837a;

    public m31(t31 t31Var) {
        this.f35837a = t31Var;
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.f35837a.f38151b.f(document, obj, z10, i7);
    }

    @Override
    public final boolean b() {
        return this.f35837a.f38151b.a();
    }

    @Override
    public final boolean c() {
        return this.f35837a.f38151b.c();
    }
}
