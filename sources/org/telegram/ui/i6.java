package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f37758a;
    public final c7 f37759b;
    public final p6 f37760c;
    public final q6 d;

    public i6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37758a = i10;
        this.f37759b = c7Var;
        this.f37760c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37758a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f37759b, this.f37760c, this.d, 1));
                return;
            default:
                c7.W(this.f37759b, this.f37760c, this.d);
                return;
        }
    }
}
