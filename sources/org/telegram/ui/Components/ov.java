package org.telegram.ui.Components;
public final class ov implements Runnable {
    public final int f36680a;
    public final ux f36681b;

    public ov(ux uxVar, int i7) {
        this.f36680a = i7;
        this.f36681b = uxVar;
    }

    @Override
    public final void run() {
        switch (this.f36680a) {
            case 0:
            default:
                this.f36681b.e();
                return;
        }
    }
}
