package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f36742a;
    public final y6 f36743b;
    public final n6 f36744c;
    public final o6 d;

    public e6(y6 y6Var, n6 n6Var, o6 o6Var, int i10) {
        this.f36742a = i10;
        this.f36743b = y6Var;
        this.f36744c = n6Var;
        this.d = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f36742a) {
            case 0:
                Utilities.e.c(new e6(this.f36743b, this.f36744c, this.d, 1));
                return;
            default:
                y6.b0(this.f36743b, this.f36744c, this.d);
                return;
        }
    }
}
