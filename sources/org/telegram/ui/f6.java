package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f46996a;
    public final y6 f46997b;
    public final n6 f46998c;
    public final o6 d;

    public f6(y6 y6Var, n6 n6Var, o6 o6Var, int i7) {
        this.f46996a = i7;
        this.f46997b = y6Var;
        this.f46998c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f46996a) {
            case 0:
                Utilities.f22416e.c(new f6(this.f46997b, this.f46998c, this.d, 1));
                return;
            default:
                y6.b0(this.f46997b, this.f46998c, this.d);
                return;
        }
    }
}
