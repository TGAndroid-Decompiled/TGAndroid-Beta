package org.telegram.ui.Components;
public final class z2 implements Runnable {
    public final int f40895a;
    public final gi.l3 f40896b;

    public z2(gi.l3 l3Var, int i3) {
        this.f40895a = i3;
        this.f40896b = l3Var;
    }

    @Override
    public final void run() {
        int i3 = this.f40895a;
        gi.l3 l3Var = this.f40896b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.E2(l3Var);
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(l3Var);
                return;
        }
    }
}
