package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f37419a;
    public final y6 f37420b;
    public final l6 f37421c;
    public final m6 d;

    public d6(y6 y6Var, l6 l6Var, m6 m6Var, int i9) {
        this.f37419a = i9;
        this.f37420b = y6Var;
        this.f37421c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f37419a) {
            case 0:
                Utilities.globalQueue.postRunnable(new d6(this.f37420b, this.f37421c, this.d, 1));
                return;
            default:
                y6.V(this.f37420b, this.f37421c, this.d);
                return;
        }
    }
}
