package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f27196a;
    public final ss f27197b;

    public ms(ss ssVar, int i10) {
        this.f27196a = i10;
        this.f27197b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f27196a) {
            case 0:
                this.f27197b.X(false);
                return;
            default:
                ss.R(this.f27197b);
                return;
        }
    }
}
