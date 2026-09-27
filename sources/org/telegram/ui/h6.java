package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34139a;
    public final b7 f34140b;
    public final o6 f34141c;
    public final p6 d;

    public h6(b7 b7Var, o6 o6Var, p6 p6Var, int i10) {
        this.f34139a = i10;
        this.f34140b = b7Var;
        this.f34141c = o6Var;
        this.d = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f34139a) {
            case 0:
                Utilities.globalQueue.postRunnable(new h6(this.f34140b, this.f34141c, this.d, 1));
                return;
            default:
                b7.X(this.f34140b, this.f34141c, this.d);
                return;
        }
    }
}
