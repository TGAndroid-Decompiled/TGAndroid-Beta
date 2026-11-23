package org.telegram.ui.Components;
public final class ia0 implements Runnable {
    public final int f35969a;
    public final ja0 f35970b;

    public ia0(ja0 ja0Var, int i7) {
        this.f35969a = i7;
        this.f35970b = ja0Var;
    }

    @Override
    public final void run() {
        switch (this.f35969a) {
            case 0:
                ja0 ja0Var = this.f35970b;
                if (ja0Var.W != -1) {
                    org.telegram.messenger.ks.f(ja0Var.Y.f37742d0.f39890x).j(ja0Var.W);
                    ja0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f35970b.Y.i();
                return;
            default:
                ja0 ja0Var2 = this.f35970b;
                if (ja0Var2.W != -1) {
                    org.telegram.messenger.ks.f(ja0Var2.Y.f37742d0.f39890x).j(ja0Var2.W);
                    ja0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
