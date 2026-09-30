package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33360a;
    public final z6 f33361b;
    public final l6 f33362c;
    public final m6 d;

    public e6(z6 z6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f33360a = i10;
        this.f33361b = z6Var;
        this.f33362c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f33360a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f33361b, this.f33362c, this.d, 1));
                return;
            default:
                z6.W(this.f33361b, this.f33362c, this.d);
                return;
        }
    }
}
