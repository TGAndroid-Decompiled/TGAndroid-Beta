package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f40153a;
    public final c7 f40154b;
    public final q6 f40155c;
    public final r6 d;

    public i6(c7 c7Var, q6 q6Var, r6 r6Var, int i10) {
        this.f40153a = i10;
        this.f40154b = c7Var;
        this.f40155c = q6Var;
        this.d = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f40153a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f40154b, this.f40155c, this.d, 1));
                return;
            default:
                c7.X(this.f40154b, this.f40155c, this.d);
                return;
        }
    }
}
