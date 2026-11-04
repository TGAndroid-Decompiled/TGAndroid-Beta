package org.telegram.ui.Components;
public final class y0 implements Runnable {
    public final int f40559a;
    public final s4 f40560b;
    public final org.telegram.ui.ActionBar.s1 f40561c;
    public final org.telegram.ui.ActionBar.d2 d;

    public y0(s4 s4Var, org.telegram.ui.ActionBar.s1 s1Var, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.f40559a = i3;
        this.f40560b = s4Var;
        this.f40561c = s1Var;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f40559a) {
            case 0:
                org.telegram.messenger.g0.h3(new y0(this.f40560b, this.f40561c, this.d, 1));
                return;
            default:
                t4.d0(this.f40560b, this.f40561c, this.d);
                return;
        }
    }
}
