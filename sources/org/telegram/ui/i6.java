package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f37856a;
    public final c7 f37857b;
    public final p6 f37858c;
    public final q6 d;

    public i6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37856a = i10;
        this.f37857b = c7Var;
        this.f37858c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37856a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.f37857b, this.f37858c, this.d, 1));
                return;
            default:
                c7.W(this.f37857b, this.f37858c, this.d);
                return;
        }
    }
}
