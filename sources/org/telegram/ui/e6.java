package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f33250a;
    public final z6 f33251b;
    public final l6 f33252c;
    public final m6 d;

    public e6(z6 z6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f33250a = i10;
        this.f33251b = z6Var;
        this.f33252c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f33250a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f33251b, this.f33252c, this.d, 1));
                return;
            default:
                z6.W(this.f33251b, this.f33252c, this.d);
                return;
        }
    }
}
