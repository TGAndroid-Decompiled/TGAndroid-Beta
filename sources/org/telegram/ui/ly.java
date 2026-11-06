package org.telegram.ui;
public final class ly implements Runnable {
    public final int f47574a;
    public final gz f47575b;

    public ly(gz gzVar, int i7) {
        this.f47574a = i7;
        this.f47575b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f47574a) {
            case 0:
                gz.a0(this.f47575b);
                return;
            default:
                gz.b0(this.f47575b);
                return;
        }
    }
}
