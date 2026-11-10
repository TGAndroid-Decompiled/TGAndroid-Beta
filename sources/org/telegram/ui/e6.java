package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f45174a;
    public final y6 f45175b;
    public final n6 f45176c;
    public final o6 d;

    public e6(y6 y6Var, n6 n6Var, o6 o6Var, int i7) {
        this.f45174a = i7;
        this.f45175b = y6Var;
        this.f45176c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f45174a) {
            case 0:
                Utilities.f21341e.c(new e6(this.f45175b, this.f45176c, this.d, 1));
                return;
            default:
                y6.b0(this.f45175b, this.f45176c, this.d);
                return;
        }
    }
}
