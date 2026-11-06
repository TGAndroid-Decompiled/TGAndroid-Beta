package org.telegram.ui;
public final class ly implements Runnable {
    public final int f47601a;
    public final gz f47602b;

    public ly(gz gzVar, int i7) {
        this.f47601a = i7;
        this.f47602b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f47601a) {
            case 0:
                gz.a0(this.f47602b);
                return;
            default:
                gz.b0(this.f47602b);
                return;
        }
    }
}
