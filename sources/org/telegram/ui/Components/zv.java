package org.telegram.ui.Components;
public final class zv implements Runnable {
    public final int f43049a;
    public final ey f43050b;

    public zv(ey eyVar, int i7) {
        this.f43049a = i7;
        this.f43050b = eyVar;
    }

    @Override
    public final void run() {
        switch (this.f43049a) {
            case 0:
            default:
                this.f43050b.e();
                return;
        }
    }
}
