package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f37702a;
    public final x6 f37703b;
    public final l6 f37704c;
    public final m6 d;

    public e6(x6 x6Var, l6 l6Var, m6 m6Var, int i10) {
        this.f37702a = i10;
        this.f37703b = x6Var;
        this.f37704c = l6Var;
        this.d = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f37702a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.f37703b, this.f37704c, this.d, 1));
                return;
            default:
                x6.W(this.f37703b, this.f37704c, this.d);
                return;
        }
    }
}
