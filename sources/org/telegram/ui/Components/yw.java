package org.telegram.ui.Components;
public final class yw implements Runnable {
    public final int f35144a;
    public final gz f35145b;

    public yw(gz gzVar, int i10) {
        this.f35144a = i10;
        this.f35145b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f35144a) {
            case 0:
            default:
                this.f35145b.e();
                return;
        }
    }
}
