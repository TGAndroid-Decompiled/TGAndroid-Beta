package org.telegram.ui.Components;
public final class v90 implements Runnable {
    public final int f33600a;
    public final w90 f33601b;
    public final aa0 f33602c;

    public v90(w90 w90Var, aa0 aa0Var, int i10) {
        this.f33600a = i10;
        this.f33601b = w90Var;
        this.f33602c = aa0Var;
    }

    @Override
    public final void run() {
        switch (this.f33600a) {
            case 0:
                this.f33601b.k(this.f33602c, false);
                return;
            default:
                this.f33601b.k(this.f33602c, false);
                return;
        }
    }
}
