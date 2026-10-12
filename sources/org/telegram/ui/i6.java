package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f37041a;
    public final d7 f37042b;
    public final q6 f37043c;
    public final r6 d;

    public i6(d7 d7Var, q6 q6Var, r6 r6Var, int i10) {
        this.f37041a = i10;
        this.f37042b = d7Var;
        this.f37043c = q6Var;
        this.d = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f37041a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f37042b, this.f37043c, this.d, 1));
                return;
            default:
                d7.W(this.f37042b, this.f37043c, this.d);
                return;
        }
    }
}
