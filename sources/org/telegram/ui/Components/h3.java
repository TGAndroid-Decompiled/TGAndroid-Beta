package org.telegram.ui.Components;
public final class h3 implements Runnable {
    public final int f35708a;
    public final hi.m3 f35709b;

    public h3(hi.m3 m3Var, int i7) {
        this.f35708a = i7;
        this.f35709b = m3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35708a;
        hi.m3 m3Var = this.f35709b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(m3Var);
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(m3Var);
                return;
        }
    }
}
