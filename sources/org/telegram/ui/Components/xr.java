package org.telegram.ui.Components;
public final class xr implements Runnable {
    public final int f41754a;
    public final bs f41755b;

    public xr(bs bsVar, int i7) {
        this.f41754a = i7;
        this.f41755b = bsVar;
    }

    @Override
    public final void run() {
        switch (this.f41754a) {
            case 0:
                this.f41755b.X(false);
                return;
            default:
                this.f41755b.O(true);
                return;
        }
    }
}
