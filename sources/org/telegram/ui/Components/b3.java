package org.telegram.ui.Components;
public final class b3 implements Runnable {
    public final int f32019a;
    public final fi.m3 f32020b;

    public b3(fi.m3 m3Var, int i7) {
        this.f32019a = i7;
        this.f32020b = m3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f32019a;
        fi.m3 m3Var = this.f32020b;
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
