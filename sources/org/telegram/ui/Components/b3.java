package org.telegram.ui.Components;
public final class b3 implements Runnable {
    public final int f31988a;
    public final fi.m3 f31989b;

    public b3(fi.m3 m3Var, int i7) {
        this.f31988a = i7;
        this.f31989b = m3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31988a;
        fi.m3 m3Var = this.f31989b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(m3Var);
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                org.telegram.messenger.g0.E2(m3Var);
                return;
        }
    }
}
