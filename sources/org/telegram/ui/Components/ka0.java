package org.telegram.ui.Components;
public final class ka0 implements Runnable {
    public final int f35358a;
    public final la0 f35359b;

    public ka0(la0 la0Var, int i3) {
        this.f35358a = i3;
        this.f35359b = la0Var;
    }

    @Override
    public final void run() {
        switch (this.f35358a) {
            case 0:
                this.f35359b.y();
                return;
            default:
                this.f35359b.m(true);
                return;
        }
    }
}
