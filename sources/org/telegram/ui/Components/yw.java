package org.telegram.ui.Components;
public final class yw implements Runnable {
    public final int f35141a;
    public final gz f35142b;

    public yw(gz gzVar, int i10) {
        this.f35141a = i10;
        this.f35142b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f35141a) {
            case 0:
            default:
                this.f35142b.e();
                return;
        }
    }
}
