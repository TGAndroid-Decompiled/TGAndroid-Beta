package org.telegram.ui.Components;
public final class sq0 implements org.telegram.messenger.q20 {
    public final int f30340a;
    public final zt0 f30341b;

    public sq0(zt0 zt0Var, int i10) {
        this.f30340a = i10;
        this.f30341b = zt0Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f30340a;
        zt0 zt0Var = this.f30341b;
        th.y4 y4Var = (th.y4) obj;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.h3(new gi0(7, zt0Var, y4Var), 100L);
                return;
            default:
                int[] iArr = zt0.f33165s2;
                org.telegram.messenger.i0.h3(new gi0(7, zt0Var, y4Var), 100L);
                return;
        }
    }
}
