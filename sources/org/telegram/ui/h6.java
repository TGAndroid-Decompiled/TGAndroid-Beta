package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f36869a;
    public final a7 f36870b;
    public final o6 f36871c;
    public final p6 d;

    public h6(a7 a7Var, o6 o6Var, p6 p6Var, int i10) {
        this.f36869a = i10;
        this.f36870b = a7Var;
        this.f36871c = o6Var;
        this.d = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f36869a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f36870b, this.f36871c, this.d, 1));
                return;
            default:
                a7.X(this.f36870b, this.f36871c, this.d);
                return;
        }
    }
}
