package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f40150a;
    public final c7 f40151b;
    public final q6 f40152c;
    public final r6 d;

    public i6(c7 c7Var, q6 q6Var, r6 r6Var, int i10) {
        this.f40150a = i10;
        this.f40151b = c7Var;
        this.f40152c = q6Var;
        this.d = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f40150a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f40151b, this.f40152c, this.d, 1));
                return;
            default:
                c7.X(this.f40151b, this.f40152c, this.d);
                return;
        }
    }
}
