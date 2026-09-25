package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33278a;
    public final z6 f33279b;
    public final l6 f33280c;
    public final m6 d;

    public e6(z6 z6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f33278a = i10;
        this.f33279b = z6Var;
        this.f33280c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f33278a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f33279b, this.f33280c, this.d, 1));
                return;
            default:
                z6.W(this.f33279b, this.f33280c, this.d);
                return;
        }
    }
}
