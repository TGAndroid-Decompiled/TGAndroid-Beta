package org.telegram.ui.Components;
public final class ov implements Runnable {
    public final int f36696a;
    public final ux f36697b;

    public ov(ux uxVar, int i7) {
        this.f36696a = i7;
        this.f36697b = uxVar;
    }

    @Override
    public final void run() {
        switch (this.f36696a) {
            case 0:
            default:
                this.f36697b.e();
                return;
        }
    }
}
