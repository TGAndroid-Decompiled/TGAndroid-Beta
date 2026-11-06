package org.telegram.ui.Components;
public final class ov implements Runnable {
    public final int f36784a;
    public final ux f36785b;

    public ov(ux uxVar, int i7) {
        this.f36784a = i7;
        this.f36785b = uxVar;
    }

    @Override
    public final void run() {
        switch (this.f36784a) {
            case 0:
            default:
                this.f36785b.e();
                return;
        }
    }
}
