package org.telegram.ui.Components;
public final class ep0 implements org.telegram.messenger.x10 {
    public final int f34781a;
    public final gt0 f34782b;

    public ep0(gt0 gt0Var, int i7) {
        this.f34781a = i7;
        this.f34782b = gt0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f34781a;
        gt0 gt0Var = this.f34782b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new hn0(3, gt0Var, i6Var), 100L);
                return;
            default:
                int[] iArr = gt0.f35563t2;
                org.telegram.messenger.g0.h3(new hn0(3, gt0Var, i6Var), 100L);
                return;
        }
    }
}
