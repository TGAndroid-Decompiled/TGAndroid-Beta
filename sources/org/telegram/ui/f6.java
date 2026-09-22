package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33527a;
    public final z6 f33528b;
    public final m6 f33529c;
    public final n6 d;

    public f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f33527a = i10;
        this.f33528b = z6Var;
        this.f33529c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f33527a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f33528b, this.f33529c, this.d, 1));
                return;
            default:
                z6.X(this.f33528b, this.f33529c, this.d);
                return;
        }
    }
}
