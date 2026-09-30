package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33266a;
    public final z6 f33267b;
    public final l6 f33268c;
    public final m6 d;

    public e6(z6 z6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f33266a = i10;
        this.f33267b = z6Var;
        this.f33268c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f33266a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f33267b, this.f33268c, this.d, 1));
                return;
            default:
                z6.W(this.f33267b, this.f33268c, this.d);
                return;
        }
    }
}
