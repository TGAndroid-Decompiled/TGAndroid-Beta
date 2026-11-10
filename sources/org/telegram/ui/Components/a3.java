package org.telegram.ui.Components;
public final class a3 implements Runnable {
    public final int f31677a;
    public final fi.m3 f31678b;

    public a3(fi.m3 m3Var, int i7) {
        this.f31677a = i7;
        this.f31678b = m3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31677a;
        fi.m3 m3Var = this.f31678b;
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
