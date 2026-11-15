package org.telegram.ui.Components;
public final class vo0 implements org.telegram.messenger.z10 {
    public final int f40480a;
    public final ys0 f40481b;

    public vo0(ys0 ys0Var, int i7) {
        this.f40480a = i7;
        this.f40481b = ys0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f40480a;
        ys0 ys0Var = this.f40481b;
        fi.l6 l6Var = (fi.l6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new hh0(7, ys0Var, l6Var), 100L);
                return;
            default:
                int[] iArr = ys0.f42073t2;
                org.telegram.messenger.g0.i3(new hh0(7, ys0Var, l6Var), 100L);
                return;
        }
    }
}
