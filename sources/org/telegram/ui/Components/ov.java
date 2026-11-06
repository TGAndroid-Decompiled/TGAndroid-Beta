package org.telegram.ui.Components;
public final class ov implements Runnable {
    public final int f36662a;
    public final ux f36663b;

    public ov(ux uxVar, int i7) {
        this.f36662a = i7;
        this.f36663b = uxVar;
    }

    @Override
    public final void run() {
        switch (this.f36662a) {
            case 0:
            default:
                this.f36663b.e();
                return;
        }
    }
}
