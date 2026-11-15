package org.telegram.ui.Components;
public final class xr implements Runnable {
    public final int f41746a;
    public final bs f41747b;

    public xr(bs bsVar, int i7) {
        this.f41746a = i7;
        this.f41747b = bsVar;
    }

    @Override
    public final void run() {
        switch (this.f41746a) {
            case 0:
                this.f41747b.X(false);
                return;
            default:
                this.f41747b.O(true);
                return;
        }
    }
}
