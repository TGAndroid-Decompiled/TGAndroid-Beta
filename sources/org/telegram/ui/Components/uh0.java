package org.telegram.ui.Components;
public final class uh0 implements Runnable {
    public final int f33410a;
    public final xh0 f33411b;

    public uh0(xh0 xh0Var, int i10) {
        this.f33410a = i10;
        this.f33411b = xh0Var;
    }

    @Override
    public final void run() {
        switch (this.f33410a) {
            case 0:
                this.f33411b.a(true);
                return;
            default:
                this.f33411b.d();
                return;
        }
    }
}
