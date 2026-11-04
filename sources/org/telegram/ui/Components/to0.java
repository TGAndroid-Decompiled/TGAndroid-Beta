package org.telegram.ui.Components;
public final class to0 implements org.telegram.messenger.u10 {
    public final int f38531a;
    public final ws0 f38532b;

    public to0(ws0 ws0Var, int i3) {
        this.f38531a = i3;
        this.f38532b = ws0Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f38531a;
        ws0 ws0Var = this.f38532b;
        ei.s6 s6Var = (ei.s6) obj;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.i3(new j50(18, ws0Var, s6Var), 100L);
                return;
            default:
                int[] iArr = ws0.f40063t2;
                org.telegram.messenger.g0.i3(new j50(18, ws0Var, s6Var), 100L);
                return;
        }
    }
}
