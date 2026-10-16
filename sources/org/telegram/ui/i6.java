package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f36729a;
    public final d7 f36730b;
    public final q6 f36731c;
    public final r6 d;

    public i6(d7 d7Var, q6 q6Var, r6 r6Var, int i10) {
        this.f36729a = i10;
        this.f36730b = d7Var;
        this.f36731c = q6Var;
        this.d = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f36729a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f36730b, this.f36731c, this.d, 1));
                return;
            default:
                d7.W(this.f36730b, this.f36731c, this.d);
                return;
        }
    }
}
