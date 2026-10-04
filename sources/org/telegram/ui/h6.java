package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f36875a;
    public final a7 f36876b;
    public final o6 f36877c;
    public final p6 d;

    public h6(a7 a7Var, o6 o6Var, p6 p6Var, int i10) {
        this.f36875a = i10;
        this.f36876b = a7Var;
        this.f36877c = o6Var;
        this.d = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f36875a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f36876b, this.f36877c, this.d, 1));
                return;
            default:
                a7.X(this.f36876b, this.f36877c, this.d);
                return;
        }
    }
}
