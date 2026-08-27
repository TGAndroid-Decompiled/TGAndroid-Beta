package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class e6 implements Runnable {

    public final int f37636a;

    public final z6 f37637b;

    public final m6 f37638c;
    public final n6 d;

    public e6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.f37636a = i10;
        this.f37637b = z6Var;
        this.f37638c = m6Var;
        this.d = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f37636a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f37637b, this.f37638c, this.d, 1));
                break;
            default:
                z6.W(this.f37637b, this.f37638c, this.d);
                break;
        }
    }
}
