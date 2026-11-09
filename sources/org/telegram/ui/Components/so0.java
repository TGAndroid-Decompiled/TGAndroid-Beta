package org.telegram.ui.Components;
public final class so0 implements org.telegram.messenger.c20 {
    public final int f38133a;
    public final zs0 f38134b;

    public so0(zs0 zs0Var, int i7) {
        this.f38133a = i7;
        this.f38134b = zs0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f38133a;
        zs0 zs0Var = this.f38134b;
        di.s6 s6Var = (di.s6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new w80(13, zs0Var, s6Var), 100L);
                return;
            default:
                int[] iArr = zs0.f41052s2;
                org.telegram.messenger.g0.i3(new w80(13, zs0Var, s6Var), 100L);
                return;
        }
    }
}
