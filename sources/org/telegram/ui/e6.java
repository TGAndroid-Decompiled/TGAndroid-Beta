package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f36947a;
    public final y6 f36948b;
    public final n6 f36949c;
    public final o6 d;

    public e6(y6 y6Var, n6 n6Var, o6 o6Var, int i10) {
        this.f36947a = i10;
        this.f36948b = y6Var;
        this.f36949c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f36947a) {
            case 0:
                Utilities.e.c(new e6(this.f36948b, this.f36949c, this.d, 1));
                return;
            default:
                y6.a0(this.f36948b, this.f36949c, this.d);
                return;
        }
    }
}
