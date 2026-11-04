package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f45551a;
    public final z6 f45552b;
    public final o6 f45553c;
    public final p6 d;

    public g6(z6 z6Var, o6 o6Var, p6 p6Var, int i3) {
        this.f45551a = i3;
        this.f45552b = z6Var;
        this.f45553c = o6Var;
        this.d = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f45551a) {
            case 0:
                Utilities.f21387e.c(new g6(this.f45552b, this.f45553c, this.d, 1));
                return;
            default:
                z6.b0(this.f45552b, this.f45553c, this.d);
                return;
        }
    }
}
