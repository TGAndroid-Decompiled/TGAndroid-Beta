package org.telegram.ui.Components;
public final class i3 implements Runnable {
    public final int f36131a;
    public final hi.l3 f36132b;

    public i3(hi.l3 l3Var, int i7) {
        this.f36131a = i7;
        this.f36132b = l3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f36131a;
        hi.l3 l3Var = this.f36132b;
        switch (i7) {
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
