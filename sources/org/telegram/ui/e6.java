package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f47145a;
    public final x6 f47146b;
    public final m6 f47147c;
    public final n6 d;

    public e6(x6 x6Var, m6 m6Var, n6 n6Var, int i7) {
        this.f47145a = i7;
        this.f47146b = x6Var;
        this.f47147c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f47145a) {
            case 0:
                Utilities.f22782e.c(new e6(this.f47146b, this.f47147c, this.d, 1));
                return;
            default:
                x6.b0(this.f47146b, this.f47147c, this.d);
                return;
        }
    }
}
