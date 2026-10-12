package org.telegram.ui.Wallet;

import org.telegram.ui.jt;
public final class d1 implements Runnable {
    public final int f34607a;
    public final jt f34608b;
    public final String f34609c;

    public d1(jt jtVar, String str, int i10) {
        this.f34607a = i10;
        this.f34608b = jtVar;
        this.f34609c = str;
    }

    @Override
    public final void run() {
        switch (this.f34607a) {
            case 0:
                this.f34608b.run(this.f34609c);
                return;
            default:
                this.f34608b.run(this.f34609c);
                return;
        }
    }
}
