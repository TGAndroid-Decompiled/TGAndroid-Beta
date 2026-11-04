package org.telegram.ui.Components;
public final class nv implements Runnable {
    public final int f36626a;
    public final sx f36627b;

    public nv(sx sxVar, int i3) {
        this.f36626a = i3;
        this.f36627b = sxVar;
    }

    @Override
    public final void run() {
        switch (this.f36626a) {
            case 0:
            default:
                this.f36627b.d();
                return;
        }
    }
}
