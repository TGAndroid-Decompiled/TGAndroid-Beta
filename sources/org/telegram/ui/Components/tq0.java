package org.telegram.ui.Components;
public final class tq0 implements org.telegram.messenger.r20 {
    public final int f30702a;
    public final au0 f30703b;

    public tq0(au0 au0Var, int i10) {
        this.f30702a = i10;
        this.f30703b = au0Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f30702a;
        au0 au0Var = this.f30703b;
        th.y4 y4Var = (th.y4) obj;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.h3(new hi0(7, au0Var, y4Var), 100L);
                return;
            default:
                int[] iArr = au0.f24493s2;
                org.telegram.messenger.i0.h3(new hi0(7, au0Var, y4Var), 100L);
                return;
        }
    }
}
