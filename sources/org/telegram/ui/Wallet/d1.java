package org.telegram.ui.Wallet;

import org.telegram.ui.jt;
public final class d1 implements Runnable {
    public final int f34609a;
    public final jt f34610b;
    public final String f34611c;

    public d1(jt jtVar, String str, int i10) {
        this.f34609a = i10;
        this.f34610b = jtVar;
        this.f34611c = str;
    }

    @Override
    public final void run() {
        switch (this.f34609a) {
            case 0:
                this.f34610b.run(this.f34611c);
                return;
            default:
                this.f34610b.run(this.f34611c);
                return;
        }
    }
}
