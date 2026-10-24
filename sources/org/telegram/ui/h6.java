package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f37761a;
    public final c7 f37762b;
    public final p6 f37763c;
    public final q6 d;

    public h6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37761a = i10;
        this.f37762b = c7Var;
        this.f37763c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37761a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f37762b, this.f37763c, this.d, 1));
                return;
            default:
                c7.W(this.f37762b, this.f37763c, this.d);
                return;
        }
    }
}
