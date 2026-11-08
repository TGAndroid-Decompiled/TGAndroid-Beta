package org.telegram.ui;
public final class ly implements Runnable {
    public final int f47597a;
    public final gz f47598b;

    public ly(gz gzVar, int i7) {
        this.f47597a = i7;
        this.f47598b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f47597a) {
            case 0:
                gz.a0(this.f47598b);
                return;
            default:
                gz.b0(this.f47598b);
                return;
        }
    }
}
