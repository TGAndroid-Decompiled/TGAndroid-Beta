package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f47068a;
    public final x6 f47069b;
    public final m6 f47070c;
    public final n6 d;

    public e6(x6 x6Var, m6 m6Var, n6 n6Var, int i7) {
        this.f47068a = i7;
        this.f47069b = x6Var;
        this.f47070c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f47068a) {
            case 0:
                Utilities.f22779e.c(new e6(this.f47069b, this.f47070c, this.d, 1));
                return;
            default:
                x6.b0(this.f47069b, this.f47070c, this.d);
                return;
        }
    }
}
