package org.telegram.ui;
public final class ly implements Runnable {
    public final int f47600a;
    public final gz f47601b;

    public ly(gz gzVar, int i7) {
        this.f47600a = i7;
        this.f47601b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f47600a) {
            case 0:
                gz.a0(this.f47601b);
                return;
            default:
                gz.b0(this.f47601b);
                return;
        }
    }
}
