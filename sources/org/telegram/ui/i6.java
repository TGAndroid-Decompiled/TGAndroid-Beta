package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f40052a;
    public final c7 f40053b;
    public final q6 f40054c;
    public final r6 d;

    public i6(c7 c7Var, q6 q6Var, r6 r6Var, int i10) {
        this.f40052a = i10;
        this.f40053b = c7Var;
        this.f40054c = q6Var;
        this.d = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f40052a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f40053b, this.f40054c, this.d, 1));
                return;
            default:
                c7.X(this.f40053b, this.f40054c, this.d);
                return;
        }
    }
}
