package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33502a;
    public final z6 f33503b;
    public final m6 f33504c;
    public final n6 d;

    public f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f33502a = i10;
        this.f33503b = z6Var;
        this.f33504c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f33502a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.f33503b, this.f33504c, this.d, 1));
                return;
            default:
                z6.X(this.f33503b, this.f33504c, this.d);
                return;
        }
    }
}
