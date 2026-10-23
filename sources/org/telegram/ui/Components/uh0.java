package org.telegram.ui.Components;
public final class uh0 implements Runnable {
    public final int f31166a;
    public final xh0 f31167b;

    public uh0(xh0 xh0Var, int i10) {
        this.f31166a = i10;
        this.f31167b = xh0Var;
    }

    @Override
    public final void run() {
        switch (this.f31166a) {
            case 0:
                this.f31167b.a(true);
                return;
            default:
                this.f31167b.d();
                return;
        }
    }
}
