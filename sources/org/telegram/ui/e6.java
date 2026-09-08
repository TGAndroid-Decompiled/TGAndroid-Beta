package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35968a;
    public final z6 f35969b;
    public final m6 f35970c;
    public final n6 d;

    public e6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f35968a = i10;
        this.f35969b = z6Var;
        this.f35970c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f35968a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f35969b, this.f35970c, this.d, 1));
                return;
            default:
                z6.W(this.f35969b, this.f35970c, this.d);
                return;
        }
    }
}
