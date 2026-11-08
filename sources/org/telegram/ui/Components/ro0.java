package org.telegram.ui.Components;
public final class ro0 implements org.telegram.messenger.c20 {
    public final int f37737a;
    public final xs0 f37738b;

    public ro0(xs0 xs0Var, int i7) {
        this.f37737a = i7;
        this.f37738b = xs0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f37737a;
        xs0 xs0Var = this.f37738b;
        di.r6 r6Var = (di.r6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new v80(13, xs0Var, r6Var), 100L);
                return;
            default:
                int[] iArr = xs0.f40386s2;
                org.telegram.messenger.g0.i3(new v80(13, xs0Var, r6Var), 100L);
                return;
        }
    }
}
