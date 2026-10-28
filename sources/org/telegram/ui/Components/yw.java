package org.telegram.ui.Components;
public final class yw implements Runnable {
    public final int f35177a;
    public final gz f35178b;

    public yw(gz gzVar, int i10) {
        this.f35177a = i10;
        this.f35178b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f35177a) {
            case 0:
            default:
                this.f35178b.e();
                return;
        }
    }
}
