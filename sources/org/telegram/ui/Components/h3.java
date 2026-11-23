package org.telegram.ui.Components;
public final class h3 implements Runnable {
    public final int f35625a;
    public final hi.u3 f35626b;

    public h3(hi.u3 u3Var, int i7) {
        this.f35625a = i7;
        this.f35626b = u3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35625a;
        hi.u3 u3Var = this.f35626b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.E2(u3Var);
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                org.telegram.messenger.g0.E2(u3Var);
                return;
        }
    }
}
