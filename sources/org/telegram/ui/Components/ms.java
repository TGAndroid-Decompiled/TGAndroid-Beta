package org.telegram.ui.Components;
public final class ms implements Runnable {
    public final int f27493a;
    public final ss f27494b;

    public ms(ss ssVar, int i10) {
        this.f27493a = i10;
        this.f27494b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f27493a) {
            case 0:
                this.f27494b.X(false);
                return;
            default:
                ss.R(this.f27494b);
                return;
        }
    }
}
