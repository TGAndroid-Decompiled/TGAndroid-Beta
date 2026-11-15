package org.telegram.ui.Components;
public final class z2 implements Runnable {
    public final int f42215a;
    public final hi.l3 f42216b;

    public z2(hi.l3 l3Var, int i7) {
        this.f42215a = i7;
        this.f42216b = l3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42215a;
        hi.l3 l3Var = this.f42216b;
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
