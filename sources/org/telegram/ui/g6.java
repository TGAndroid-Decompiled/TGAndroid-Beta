package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33859a;
    public final a7 f33860b;
    public final n6 f33861c;
    public final o6 d;

    public g6(a7 a7Var, n6 n6Var, o6 o6Var, int i10) {
        this.f33859a = i10;
        this.f33860b = a7Var;
        this.f33861c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f33859a) {
            case 0:
                Utilities.globalQueue.postRunnable(new g6(this.f33860b, this.f33861c, this.d, 1));
                return;
            default:
                a7.X(this.f33860b, this.f33861c, this.d);
                return;
        }
    }
}
