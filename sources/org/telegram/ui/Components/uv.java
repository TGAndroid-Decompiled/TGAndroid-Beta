package org.telegram.ui.Components;
public final class uv implements Runnable {
    public final int f40167a;
    public final zx f40168b;

    public uv(zx zxVar, int i7) {
        this.f40167a = i7;
        this.f40168b = zxVar;
    }

    @Override
    public final void run() {
        switch (this.f40167a) {
            case 0:
            default:
                this.f40168b.e();
                return;
        }
    }
}
