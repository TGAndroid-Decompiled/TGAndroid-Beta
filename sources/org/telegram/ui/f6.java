package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33440a;
    public final z6 f33441b;
    public final m6 f33442c;
    public final n6 d;

    public f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f33440a = i10;
        this.f33441b = z6Var;
        this.f33442c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f33440a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f33441b, this.f33442c, this.d, 1));
                return;
            default:
                z6.X(this.f33441b, this.f33442c, this.d);
                return;
        }
    }
}
