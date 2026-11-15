package org.telegram.ui.Wallet;

import org.telegram.ui.x21;
public final class b1 implements Runnable {
    public final int f43496a;
    public final x21 f43497b;
    public final String f43498c;

    public b1(x21 x21Var, String str, int i7) {
        this.f43496a = i7;
        this.f43497b = x21Var;
        this.f43498c = str;
    }

    @Override
    public final void run() {
        switch (this.f43496a) {
            case 0:
                this.f43497b.a(this.f43498c);
                return;
            default:
                this.f43497b.a(this.f43498c);
                return;
        }
    }
}
