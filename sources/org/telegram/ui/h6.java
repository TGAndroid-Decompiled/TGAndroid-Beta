package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f37334a;
    public final b7 f37335b;
    public final p6 f37336c;
    public final q6 d;

    public h6(b7 b7Var, p6 p6Var, q6 q6Var, int i10) {
        this.f37334a = i10;
        this.f37335b = b7Var;
        this.f37336c = p6Var;
        this.d = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f37334a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f37335b, this.f37336c, this.d, 1));
                return;
            default:
                b7.W(this.f37335b, this.f37336c, this.d);
                return;
        }
    }
}
