package org.telegram.ui.Components;
public final class ro0 implements org.telegram.messenger.c20 {
    public final int f37720a;
    public final ys0 f37721b;

    public ro0(ys0 ys0Var, int i7) {
        this.f37720a = i7;
        this.f37721b = ys0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f37720a;
        ys0 ys0Var = this.f37721b;
        di.s6 s6Var = (di.s6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new r80(14, ys0Var, s6Var), 100L);
                return;
            default:
                int[] iArr = ys0.f40644s2;
                org.telegram.messenger.g0.i3(new r80(14, ys0Var, s6Var), 100L);
                return;
        }
    }
}
