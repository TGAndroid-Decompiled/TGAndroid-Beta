package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f37227a;
    public final b7 f37228b;
    public final p6 f37229c;
    public final q6 d;

    public h6(b7 b7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37227a = i10;
        this.f37228b = b7Var;
        this.f37229c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37227a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f37228b, this.f37229c, this.d, 1));
                return;
            default:
                b7.W(this.f37228b, this.f37229c, this.d);
                return;
        }
    }
}
