package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33505a;
    public final z6 f33506b;
    public final m6 f33507c;
    public final n6 d;

    public f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f33505a = i10;
        this.f33506b = z6Var;
        this.f33507c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f33505a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f33506b, this.f33507c, this.d, 1));
                return;
            default:
                z6.W(this.f33506b, this.f33507c, this.d);
                return;
        }
    }
}
