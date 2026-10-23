package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f37756a;
    public final c7 f37757b;
    public final p6 f37758c;
    public final q6 d;

    public h6(c7 c7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37756a = i10;
        this.f37757b = c7Var;
        this.f37758c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37756a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f37757b, this.f37758c, this.d, 1));
                return;
            default:
                c7.W(this.f37757b, this.f37758c, this.d);
                return;
        }
    }
}
