package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f37208a;
    public final y6 f37209b;
    public final l6 f37210c;
    public final m6 d;

    public e6(y6 y6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f37208a = i10;
        this.f37209b = y6Var;
        this.f37210c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f37208a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f37209b, this.f37210c, this.d, 1));
                return;
            default:
                y6.W(this.f37209b, this.f37210c, this.d);
                return;
        }
    }
}
