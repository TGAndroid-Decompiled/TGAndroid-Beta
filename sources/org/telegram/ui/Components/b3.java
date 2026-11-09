package org.telegram.ui.Components;
public final class b3 implements Runnable {
    public final int f32072a;
    public final fi.m3 f32073b;

    public b3(fi.m3 m3Var, int i7) {
        this.f32072a = i7;
        this.f32073b = m3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f32072a;
        fi.m3 m3Var = this.f32073b;
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
