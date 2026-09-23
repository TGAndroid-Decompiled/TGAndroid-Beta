package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33095a;
    public final z6 f33096b;
    public final m6 f33097c;
    public final n6 d;

    public f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f33095a = i10;
        this.f33096b = z6Var;
        this.f33097c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f33095a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f33096b, this.f33097c, this.d, 1));
                return;
            default:
                z6.W(this.f33096b, this.f33097c, this.d);
                return;
        }
    }
}
