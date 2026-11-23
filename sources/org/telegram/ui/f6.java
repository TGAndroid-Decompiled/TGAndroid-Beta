package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f47690a;
    public final y6 f47691b;
    public final n6 f47692c;
    public final o6 d;

    public f6(y6 y6Var, n6 n6Var, o6 o6Var, int i7) {
        this.f47690a = i7;
        this.f47691b = y6Var;
        this.f47692c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f47690a) {
            case 0:
                Utilities.f22877e.c(new f6(this.f47691b, this.f47692c, this.d, 1));
                return;
            default:
                y6.b0(this.f47691b, this.f47692c, this.d);
                return;
        }
    }
}
